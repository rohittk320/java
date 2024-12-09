import java.util.Scanner;

public class clc {
    public static void main(String[] args) {
        System.out.println("Choose operator +,*,/,-");
        char operator;
        double num1 ,num2 ,result;
        Scanner sc = new Scanner(System.in);
        operator = sc.next().charAt(0);
        System.out.println("Enter First  Number");
        num1=sc.nextDouble();
        System.out.println("Enter Second Number");
        num2=sc.nextDouble();
        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println(num1 +" + "+num2 +" = "+ result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 +" - "+num2 +" = "+ result);
                break;
            case '*':
                result = num1*num2;
                System.out.println(num1 +" * "+num2 +" = "+ result);
                break;
            case '/':
                result = num1/num2;
                System.out.println(num1 +" / "+num2 +" = "+ result);
            default:
                System.out.println("invalid operator");
        }
    }
}
