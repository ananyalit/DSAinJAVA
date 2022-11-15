public class Maxin2darray {
    public static void main(String args[]) {
        int[][] arr = {
                { 2, 8, 7, 33 },
                { 4, 5, 3, 99, 78 },
                { 6, 99, 56, 100 },
                { 71, 20, 183 }
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}