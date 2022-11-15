import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int temp, r, sum = 0;
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not a palindrome number");
        }
    }
}
