package Practice;
import java.util.Scanner;
public class abcd {
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter array ");
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
            int c = num[i];
            int arm = 0;
            int rem;
            while (num[i] > 0) {
                rem = num[i]%10;
                arm = (rem*rem*rem) + arm;
                num[i] = num[i]/10;
            }
            if (arm == c) {
                System.out.println("number is aramstrong "+ arm);
            }
            else {
                System.out.println("number is non armstrong "+ arm);
            }
        }
    }
}
