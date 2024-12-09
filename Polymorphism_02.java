class ani {
    public void method() {
        System.out.println("india");
    }
}
class rat extends ani {
    public void method() {
        System.out.println("aus");
    }
}
class got extends ani {
    public void method(){
        System.out.println("usa");
    }
}
public class Polymorphism_02 {
    public static void main(String[] args) {
        ani obj1 = new ani();
        rat obj2 = new rat();
        got obj3 = new got();
        obj1.method();
        obj2.method();
        obj3.method();
    }
}
