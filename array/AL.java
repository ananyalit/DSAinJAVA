
//package Java-programs.array;
import java.util.ArrayList;
import java.util.*;

public class AL {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);

        System.out.println(list);

        System.out.println(list.contains(2));
        System.out.println(list.set(0, 99));
        System.out.println(list.remove(2));

        System.out.println(list);

        //input 
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }
}
