import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int f = 1;
        int i;
        for (i = 1; i <=n ; i++) {
            f = f * i;
        }
        System.out.println(f);

    }
}
