package inheritence;

// Multilevel  inheritence
class Animal {   // chain of inheritence
    void method1(){
        System.out.println("method 1");
    }
}
class Lion extends Animal{
    void method2(){
        System.out.println("method 2");
    }
}
class Elephant extends Lion{
    void method3(){
        System.out.println("method 3");
    }
}
public class MultiLevel_inheri {
    public static void main(String[] args) {
        Elephant obj9 = new Elephant();
        obj9.method1();
        obj9.method2();
        obj9.method3();
    }
}