import java.util.Scanner;
public class Array_method {
    static void Tilak(int x[]) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                System.out.println("even no= " + x[i]);
            } else {
                System.out.println("Odd no= " + x[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int y[]= new int [size];
        System.out.println("enter your array number");
        for (int i=0; i < size; i++) {
            y[i]=sc.nextInt();
        }
        Tilak(y);
    }
}
