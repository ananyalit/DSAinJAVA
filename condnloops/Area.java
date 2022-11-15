import java.util.Scanner;

public class Area {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        // area of circle
        System.out.println("Enter radius: ");
        int r = input.nextInt();
        System.out.println("Area of circle:" + pi * r * r);

        // area of triangle, isosceles triangle
        System.out.println("Enter height: ");
        int h = input.nextInt();
        System.out.println("Enter base: ");
        int b = input.nextInt();
        System.out.println("Area of traingle:" + (b * h) / 2);
        System.out.println("Area of isosceles traingle:" + (b * h) / 2);

        // area of equilateral triangle
        System.out.println("Enter the side length: ");
        int a = input.nextInt();
        System.out.println("Area of equilateral traingle:" + Math.pow(3, 1 / 3) * a * a);

        // area of parallelogram
        System.out.println("Area of parallelogram: " + b * h);

        // area of rhombus
        System.out.println("Enter diagonal 1: ");
        int d1 = input.nextInt();
        System.out.println("Enter diagonal 2: ");
        int d2 = input.nextInt();
        System.out.println("Area of rhombus: " + (d1 * d2) / 2);

    }
}
