import java.util.Scanner;

//package Java-programs.functions;
//Reverse A String In Java
public class Reverse {
    public static void main(String args[]) {
        rev();
        // System.out.println(reverse);

    }

    static String rev() {
        String original, reverse = "";
        Scanner input = new Scanner(System.in);
        original = input.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }
}
