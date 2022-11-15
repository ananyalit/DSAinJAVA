import java.util.Scanner;

// Input currency in rupees and output in USD.
public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amout of money in INR: ");
        int inr = input.nextInt();
        double usd = inr * 0.013;
        System.out.println("The amout you entered in INR is worth " + usd + " USD.");
    }
}