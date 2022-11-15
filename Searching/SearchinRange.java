//package Java-programs.LinearSearch;

public class SearchinRange {
    public static void main(String args[]) {
        int[] arr = { 3, 4, 5, 11, 9, -50, 88, -34 };
        int target = 9;
        System.out.println(linear_search(arr, target, 1, 6));
    }

    static int linear_search(int[] nums, int target, int start, int end) {
        if (nums.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
            if (nums[index] == target) {
                return index;
            }
        }
        // this will execute if none of the return statements above have executed, hence
        // the target not found
        return -1;
    }
}
