
import java.util.Scanner;

public class CaseCheck {
    public static void main(String arg[]) {
        System.out.println("Enter a string or a character: ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        // trim deletes the spaces before and after the word and then prints it.
        // charAt(index) prints the character at the index number 0.
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
