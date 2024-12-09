package Practice;
import java.util.Scanner;
public class xyz {
    public static void main(String[] args) {
        int num ,rem,rev,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();
        temp = num;
        rev = 0;
        while(num > 0) {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if (rev == temp) {
            System.out.println("number is palindrome "+ rev);
        }
        else{
            System.out.println("number is non palindrome "+ rev);
        }
    }
}