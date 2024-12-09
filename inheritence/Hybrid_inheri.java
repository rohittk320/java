package inheritence;

class Inheritance1{
    public void method1(){  // hybrid inheritance is the composition of two or more types of inheritance.
        System.out.println("Hello1");
    }
    public void method2(){
        System.out.println("Hello2");
    }

}
class Hybrid_inheri extends Inheritance1{
    public static void main(String[] args) {
        Hybrid_inheri obj8 = new Hybrid_inheri();
        obj8.method1();
        obj8.method2();
    }
}