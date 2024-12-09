public class Oops_02 {
    int a = 10;
    String name = "rohit";
    final int age = 26;
    public static void main(String[] args) {
        Oops_02 obj = new Oops_02();
        System.out.println(obj.a);
        obj.a = 20;  //Overriding
        System.out.println(obj.a);
    }
}