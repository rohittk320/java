package Practice;
import java.util.Scanner;
public class Array_user {
    public static void main(String[] args) {
        System.out.println("Enter array Size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter array");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array is " + arr[i]);
        }
    }
}