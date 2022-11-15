public class OrderagnosticBS {
    public static void main(String args[]) {
        int[] arr = { -99, -34, 7, 8, 12, 66, 87, 88, 91, 674 };
        int target = 88;
        int ans = orderagnosticbs(arr, target);
        System.out.println(ans);
    }

    static int orderagnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        //boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < mid) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mid) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
