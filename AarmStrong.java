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
<<<<<<< HEAD
                System.out.println( "hello");
                System.out.println( "World");
=======
                System.out.println(3+2);
                System.out.println(3*2);
>>>>>>> 67eeb9711c55c4abc11e0722223bd1f8306a0353

            }
        }
    }
}
