import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Enter  first number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x%i==0 && y%i==0) {
                hcf = i;
            }
        }
        System.out.println("hcf of "+x+" & "+y +" is "+ hcf);
    }
}
