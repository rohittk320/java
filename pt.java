public class pt {
    public static void main(String[] args) {
        int n = 5; // Number of levels in the pyramid

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print increasing part of the row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing part of the row
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}