import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter your second number");
        int y = sc.nextInt();
        int hcf = 1;
        for (int i = 1; i <=x && i <=y; i++) {
            if (x%i==0 && y%i==0){
                hcf = i;
            }

        }
        int lcm = (x*y)/hcf;
        System.out.println("lcm of "+ x +" and "+y +" is "+ lcm);
    }
}