package Practice;
import java.util.Scanner;
public class testhcf {
   static void hcf(int x, int y) {
       int count=1;
       for (int i = 1; i <=x && i <=y; i++) {
           if (x%i ==0 && y%i==0) {
               count = i;

           }
       }
       System.out.println("Hcf of "+x +" & "+y +" is "+  count);
   }
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc =  new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        hcf(num1,num2);
    }
}