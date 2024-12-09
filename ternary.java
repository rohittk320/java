public class ternary {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int c = 6;
        int max = 0;
        max = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println("max number is " + max);
    }
}
