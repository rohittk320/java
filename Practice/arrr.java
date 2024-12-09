package Practice;

import java.util.Scanner;

public class arrr {
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter array value");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
