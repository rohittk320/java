class animal{  // same object having diffrent behaviar
    public void method(){
        System.out.println("India");
    }
}
class rabit extends animal {
    public void method(){
        System.out.println("aus");
    }
}
class parrot extends animal {
    public void method(){
        System.out.println("Eng");
    }
}

public class Polymorphism_03 {
    public static void main(String[] args) {
        animal obj1 = new animal();
        animal obj2 = new rabit();
        animal obj3 = new parrot();
        obj2.method();
        obj3.method();
        obj1.method();
    }
}
