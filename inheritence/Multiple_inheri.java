package inheritence;

interface Father {
   void func1();
}
interface Mother {
    void func2();
}

class Child1 implements Father, Mother {
    public void func1() {
        System.out.println("func--1");
    }
    public void func2() {
        System.out.println("func--2");
    }
    void func3() {
        System.out.println("func--3");
    }
}
public class Multiple_inheri {
    public static void main(String[] args) {
        Child1 obj14 = new Child1();
        obj14.func3();
        obj14.func2();
        obj14.func1();
    }
}
