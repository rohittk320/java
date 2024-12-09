public class Method_private {
    private void add(int x, int y) {
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        Method_private obj = new Method_private();
        obj.add(10,20);
    }
}
    // does not access by any other class and need to creat object