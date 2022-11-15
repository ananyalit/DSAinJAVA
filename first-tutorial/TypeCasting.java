import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        // insert an integer, it will turn it to float = aotomatic type conversion
        System.out.println(num);

        // typecasting
        int num1 = (int) 65.89f;
        System.out.println(num1);

        // automatic type promotion in expressions
        int a = 257;
        // byte b = (int) (a); // sincce the max byte is 256, so it provides us the
        // remainder of 257 div by 256
        // that
        // is 1
        // System.out.println(b);

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int l = x * y / z; // x*y= 2000 is too high to be stored in byte so it is automatically is
                           // converted to int when java calculates the val of l, this is called automatic
                           // type promotion
        System.out.println(l);

        int number = 'A';
        System.out.println(number);

        // JAVA follows unicode
        System.out.println("你好");
        System.out.println("ਸਤ ਸ੍ਰੀ ਅਕਾਲ");

        // all the byte, short, char are promoted to int, any one of the op is long,
        // double, float the whole operation is converted to long, double anf float resp
        // int * float gives float

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.124;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

    }
}