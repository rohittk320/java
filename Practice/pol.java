package Practice;

 class Animal {
  public void sound(){
   System.out.println("Animal is sounding");
  }
}
class Dog extends Animal {
  public void sound(){
   System.out.println("dog is sounding");
  }
}
class Cat extends Animal {
  public void sound (){
   System.out.println("cat is sounding");
  }
}
public class pol {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();
        obj.sound();
        obj1.sound();
        obj2.sound();
    }
}