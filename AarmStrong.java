public class AarmStrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            int number = i;
            int arm = 0;
            int c = number;
            int l = String.valueOf(number).length();
            while (number > 0) {
                int rem = number % 10;
                arm += (int) Math.pow(rem, l);
                number = number/10;
            }
            if (arm == c) {
                System.out.println("number is armstrong "+ arm);
                System.out.println( "hello");
            }
        }
    }
}
