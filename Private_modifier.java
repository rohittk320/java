class Private {
    private int age;
    private String name = "Rohit";
    private int num = 100;

    void test() {  //access level only same class
        System.out.println("private 1");
        System.out.println(age);
        System.out.println(name);
        System.out.println(num);
    }
}
public class Private_modifier {
    public static void main(String[] args) {
        Private obj = new Private();
         //  obj.age = 26;
        // obj.name = "Thakur";
        obj.test();
    }
}
