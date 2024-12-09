import java.util.Scanner;
public class Array_2d_sum {
    public static void main(String[] args) {
        int a[][] = new int[2][3]; // 2row*3coloum
        int b[][] = new int[2][3];
        int c[][] = new int[2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first matrix data");
        for (int i = 0; i < 2; i++) {  // for row
            for (int j = 0; j < 3; j++) {  // for colom
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix data");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("first matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("second matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("sum of matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
               c[i][j]= a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}