import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array value");
        int temp = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 0) {
                System.out.println("number is prime " + arr[i]);
            }
        }
    }
}

