import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers
public class Lol {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = 1, sum = 0;
        while (num != 0) {
            System.out.println("Enter a number or 0 to terminate: ");
            num = input.nextInt();
            sum += num;
        }
        System.out.println("sum: " + sum);
    }
}