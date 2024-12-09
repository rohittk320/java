import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        System.out.println("enter number");
     Scanner sc = new Scanner(System.in);
     int firstNumber = sc.nextInt();
     int secondNumber = sc.nextInt();
     int Result = firstNumber + secondNumber;
        System.out.println(Result);
        sc.close();
    }
}