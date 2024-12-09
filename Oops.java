public class Oops {  //  A Class is like an object constructor, or a "blueprint" for creating objects.
    int a=20;
    String name="Tilak";
    int salary;
    public static void main(String[] args){
        Oops MyObj1= new Oops();
        Oops MyObj2= new Oops();
        MyObj1.a = 29;  // method over riding
        MyObj1.name = "Rohit";  // method overriding
        System.out.println(MyObj1.a);
        System.out.println(MyObj1.name);
        System.out.println("Output from second object");
        System.out.println(MyObj2.a);
        System.out.println(MyObj2.name);
        MyObj1.salary=93456;
        System.out.println(MyObj1.salary);
    }
}