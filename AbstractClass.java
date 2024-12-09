abstract class AbstractClass {
    void A () {
        System.out.println("hello");
    }
}
class s1 extends AbstractClass {
    public static void main(String[] args) {
        AbstractClass obj = new s1();   // object connot creat but creat object refrence
        obj.A();
    }
}
