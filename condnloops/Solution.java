
//Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0, product = 1;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            product *= rem;
            num = num / 10;
        }
        System.out.println(product);
        System.out.println(sum);
        System.out.println(product - sum);
    }
}