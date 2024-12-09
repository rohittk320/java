import java.util.ArrayList;
import java.util.Collections;

public class ArrayLis {
    public static void main(String[] args) {
        ArrayList<Integer>  num = new ArrayList<Integer>();
        ArrayList<String>  str = new ArrayList<String>();
        // add element
        num.add(0,9);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(5);
        System.out.println(num);

        // get element
       int element =  num.get(0);
        System.out.println(element);

        // set element
        num.set(0,7);
        System.out.println(num);

        // delete
        num.remove(2);
        System.out.println(num);

        // loop
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
         // sorting
            Collections.sort(num);
            System.out.println(num);

        System.out.println(num.contains(5));

        // ensure
        num.ensureCapacity(15);
        for (int i = 0; i <= 15; i++) {
            num.add(i);
        }
       // System.out.println(num);

        // foreach
        num.forEach((n)-> {
           // System.out.println(n);
        });
    }
}
