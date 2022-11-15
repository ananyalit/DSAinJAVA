public class Binarysearch {
    public static void main(String args[]) {
        int[] arr = { -99, -78, -55, -23, 4, 8, 19, 67, 99, 104, 234 };
        int target = 67;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // start+end/2 may exceed the the integer range

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
