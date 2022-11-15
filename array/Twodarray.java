import java.util.Scanner;

public class Twodarray {
    public static void main(String args[]) {
        int r, c, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        // taking row as input
        r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        // taking column as input
        c = sc.nextInt();
        // Declaring the two-dimensional matrix
        int array[][] = new int[r][c];
        // Read the matrix values
        System.out.println("Enter the elements of the array: ");
        // loop for row
        for (i = 0; i < r; i++)
            // inner for loop for column
            for (j = 0; j < c; j++)
                array[i][j] = sc.nextInt();
        // accessing array elements
        System.out.println("Elements of the array are: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                // prints the array elements
                System.out.print(array[i][j] + " ");
            // throws the cursor to the next line
            System.out.println();
        }
    }
}