import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class Lol1 {
    public static void main(String args[]) {
        int n = 1;
        int max, min;
        max = INT_MAX;
        
        Scanner input = new Scanner(System.in);
        while (n != 0) {
            System.out.println("Enter a number or 0 to quit: ");
            n = input.nextInt();
            if (n > max) {
                n = max;
            }
            if (n < min) {
                n = min;
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
