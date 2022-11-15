import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

// Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)
public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter the two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Enter the operator: ");
        char operator = input.next().charAt(0);
        if (operator == '+') {
            result = num1 + num2;
            System.out.println(result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println(result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println(result);
        } else {
            result = num1 / num2;
            System.out.println(result);
        }
    }
}