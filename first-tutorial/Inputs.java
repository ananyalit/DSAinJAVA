import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());

        Scanner strinput = new Scanner(System.in);
        System.out.println(strinput.next());
        System.out.println(strinput.nextLine());

        int a = 25_00_000;
        System.out.println(a);

        String name = input.next();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.print(marks);

    }

}