public class Recursion_02 {
    static void rr(int n) {
        if (n==6){
            return ;
        }
        System.out.println(n);
        rr(n+1);
    }
    public static void main(String[] args) {
        rr(0);
    }
}
