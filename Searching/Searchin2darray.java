import java.util.Arrays;

//package Java-programs.LinearSearch;

public class Searchin2darray {
    public static void main(String args[]) {
        int[][] arr = {
                { 2, 8, 7, 33 },
                { 4, 5, 3, 99, 78 },
                { 6, 99, 56, 100 },
                { 71, 20, 183 }
        };
        int target = 99;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
