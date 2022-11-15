import java.util.Scanner;

public class Volume {
    public static void main(String args[]) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        // Volume Of Cone
        System.out.println("Enter radius: ");
        int r = input.nextInt();
        System.out.println("Enter height: ");
        int h = input.nextInt();
        System.out.println("Volume Of Cone: " + (pi * r * r * h) / 3);

        // Volume Of Prism = base area * h
        // Volume Of Cylinder = pi*r*r*h
        // Volume Of Sphere = 4*pi*r*r*r/3
        // Volume Of Pyramid = l*w*h
        // Curved Surface Area Of Cylinder = 2*pi*r*h
        // Total Surface Area Of Cube = 6*a*a
    }
}
