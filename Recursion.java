public class Recursion {   //  Recursion is the technique of making a function call itself
    static int sum(int x){
        if (x > 0) {
            return x+sum(x-1);  // 10+9+8+7+6+5+4+3+2+1+
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int add = sum(10);
        System.out.println(add);
    }
}
