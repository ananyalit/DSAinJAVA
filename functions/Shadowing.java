public class Shadowing {
    static int x = 90;
    public static void main(String args[]){
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }
}
//Shadowing is the practice of using 2 variables with the same name within the scope that overlaps
