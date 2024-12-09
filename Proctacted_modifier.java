class Proctacted {
    protected int age;
    protected String name = "Rohit";
    protected int num = 100;
    void test() {
        System.out.println("Protacted modifier 1");
        System.out.println(age);
        System.out.println(name);
        System.out.println(num);
    }
}
public class Proctacted_modifier {
    public static void main(String[] args) {
        Defalut obj = new Defalut();
        obj.age = 26;
        obj.test();
    }
}
//
