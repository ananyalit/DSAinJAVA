//package Java-programs.LinearSearch;

public class LinearSearch {
    public static void main(String args[]){
    int[] nums = {2,66,99,7,5,3,77,0,4};
    int target = 77;
    int ans = linear_search(nums, target);
    System.out.println(ans);
    }
    static int linear_search(int[] nums, int target){
        if(nums.length == 0){
            return -1;
        }
        //run a for loop
        for(int index =0; index<nums.length; index++){
            if(nums[index] == target){
               return index;
            }
        }
        //this will execute if none of the return statements above have executed, hence the target not found
        return -1;
    }
    
}
