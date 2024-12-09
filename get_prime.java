public class get_prime {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int flag = 0;
            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}