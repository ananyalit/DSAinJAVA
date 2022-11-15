import java.util.Scanner;

public class Largest {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the largest.");
        } else if (b > c) {
            System.out.println(b + " is the largest.");
        } else {
            System.out.println(c + " is the largest.");
        }
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
