import java.util.Scanner;

public class Perimeter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        // perimeter of circle
        System.out.println("Enter radius: ");
        int r = input.nextInt();
        System.out.println("Perimeter of circle " + 2 * pi * r);

        // perimeter of parallelogram
        System.out.println("Enter length: ");
        int l = input.nextInt();
        System.out.println("Enter breadth: ");
        int b = input.nextInt();
        System.out.println("Perimeter of parallelogram " + 2 * l * b);

        // perimeter of rhombus
        System.out.println("Enter side: ");
        int a = input.nextInt();
        System.out.println("Perimeter of rhombus " + 4 * a);

        // perimeter of equilateral triangle
        System.out.println("Enter side: ");
        int s = input.nextInt();
        System.out.println("Perimeter of equilateral triangle " + 3 * a);

        // perimeter of rectangle
        System.out.println("Perimeter of parallelogram " + 2 * l * b);

        // perimeter of square
        System.out.println("Enter side: ");
        int c = input.nextInt();

    }

}
