public class Arm {
    static void arm(int x) {
        for (int i = 1; i <= x; i++) {
            int num, rem, c, arm;
            num = i;
            arm = 0;
            c = num;
        //    int l = String.valueOf(num).length();
            String s = Integer.toString(num);
            int l = s.length();
            while (num > 0) {
                rem = num % 10;
                arm += (int) Math.pow(rem, l);
                num = num / 10;
            }
            if (c == arm) {
                System.out.println("number is armstrong " + arm);
            }
        }
    }

    public static void main(String[] args) {
        arm(2000);
    }
}