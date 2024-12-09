package Practice;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        System.out.println("Enter Array Value");
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            int temp = 0;
            num[i] = sc.nextInt();
            if (num[i] > 1) {
                for (int j = 2; j < num[i]; j++) {
                    if (num[i] % j == 0) {
                        temp = 1;
                        break;
                    }
                }
                if (temp == 0) {
                    System.out.println("prime number is "+ num[i]);
                }
            }
        }
    }
}