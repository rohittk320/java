public class Pattern_12 {
    public static void main(String[] args) {
        // for upper pattern
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            int space = 2*(n-i);
            for (int j=1; j<=space; j++) {  // 2*(5-1)=8
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // for lower pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            int space = 2*(n-i);
            for (int j = 1; j<=space; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}