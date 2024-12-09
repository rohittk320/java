package Practice;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int rev=0, rem,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size =  sc.nextInt();
        System.out.println("Enter Array Value");
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
            c=num[i];
            while (num[i]>0){
                rem = num[i]%10;
                rev = rev*10+rem;
                num[i] = num[i]/10;
              }
            if (c == rev) {
                System.out.println("number is palindrome "+ rev);
            }

        }
    }
}
