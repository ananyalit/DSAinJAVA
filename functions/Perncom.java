
//package Java-programs.functions;
//Find Ncr & Npr
//import java.util.Scanner;

public class Perncom {
    public static void main(String args[]) {
        System.out.println(perm(2, 3));
        System.out.println(comb(2, 3));
    }

    static double fact(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static double perm(int n, int r) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter n: ");
        // n = input.nextInt();
        // System.out.println("Enter r: ");
        // r = input.nextInt();
        double per = fact(n) / fact(n - r);
        return per;
    }

    static double comb(int n, int r) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter n: ");
        // n = input.nextInt();
        // System.out.println("Enter r: ");
        // r = input.nextInt();
        double comb = fact(n) / (fact(n - r) * fact(r));
        if (n<r){
            System.out.println("n value should be greater than or equals to r value");
        }
        return comb;
    }
}
