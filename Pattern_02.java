public class Pattern_02 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {  // row
            for (int j = 1; j <= i; j++) {  // coloum
               // System.out.print(" *");
                 System.out.print(i+" ");
              // System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}