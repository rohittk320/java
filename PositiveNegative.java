import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println("number is positive"+ num);
        }
        else{
            System.out.println("number is negative "+ num);
        }
    }
}
