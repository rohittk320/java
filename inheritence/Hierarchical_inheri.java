package inheritence;

class Animal1 {
    void method4() {      // When two or more classes inherits a single class
        System.out.println("method-4");
    }
}
class Dog extends Animal1{
    void method5() {
        System.out.println("method-5");
    }
}
class Cat extends Animal1{
    void method6() {
        System.out.println("method-6");
    }
}
class Monkey extends Animal1{
    void method7() {
        System.out.println("method-7");
    }
}
public class Hierarchical_inheri {
    public static void main(String[] args) {
        Animal1 s1 = new Animal1();
        Dog obj10 = new Dog();
        Cat obj11 = new Cat();
        Monkey obj12 = new Monkey();
        obj12.method7();
        obj11.method6();
        obj10.method5();
        obj12.method4();
        obj11.method4();
        s1.method4();
    }
}

