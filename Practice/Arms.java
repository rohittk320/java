package Practice;

import java.util.Scanner;

public class Arms {
    public static void main(String[] args) {
        System.out.println("Enter Array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter Array value");
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
            int c=num[i];
            int arm = 0;
            int rem;
            while (num[i]>0){
                rem = num[i]%10;
                arm = (rem*rem*rem)+arm;
                num[i] = num[i]/10;
            }
            if (c==arm){
                System.out.println("num is arm "+ arm);
            }
            else {
                System.out.println("num is non arm "+ arm);
            }
        }
    }
}
