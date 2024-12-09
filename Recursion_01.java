public class Recursion_01 {
    static int facto(int x){
        if (x > 0){
            return x*facto(x-1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int y = facto(10);
        System.out.println(y);
    }
}
