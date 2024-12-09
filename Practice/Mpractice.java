package Practice;

public class Mpractice {
    static void sum(int x, int y) {
        int z = x+y;
        System.out.println(z);
    }
    public int sub(int a, int b) {
        int c = a-b;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        sum(10,20);
        Mpractice obj = new Mpractice();
        obj.sub(10,30);
    }
}
