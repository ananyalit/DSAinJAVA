//package Java-programs.LinearSearch;

public class FindMin {
    public static void main(String args[]) {
        int[] arr = {8, 9, -2, - 8, 99, 100, 23 };
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]< ans){
               ans = arr[i];
            }
        }
        return ans;
    }
}
