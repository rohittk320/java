public class Pattern_03 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1 ; i--) {  // row
            for (int j = 1; j <=i; j++) {  // coloum
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
