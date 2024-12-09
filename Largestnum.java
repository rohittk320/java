import java.util.Scanner;
public class Largestnum {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n1 , n2 , n3;
          n1= sc.nextInt();
          n2= sc.nextInt();
          n3= sc.nextInt();
        if (n1>n2 && n1>n3) {
            System.out.println("largest number is "+ n1);
        } else if (n2>n1 && n2>n3) {
            System.out.println("largest number is "+ n2);
        }
        else {
            System.out.println("largest number is "+ n3);
        }
    }
}
