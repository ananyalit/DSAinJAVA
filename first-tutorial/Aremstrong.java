import java.util.Scanner;

public class Aremstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int result = 0;
        while (num > 0) {
            int remainder = num % 10;
            result += remainder * remainder * remainder;
            num /= 10;
        }
        if (num == result) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }

    }
}
