 class Defalut {
     int age;
     String name = "Rohit";
     int num = 100;

     void test() {
         System.out.println("modifier 1");
         System.out.println(age);
         System.out.println(name);
         System.out.println(num);
     }
 }
     public class Default_modifier {
         public static void main(String[] args) {
             Defalut obj = new Defalut();
             obj.age = 26;
             obj.test();
         }
     }

//  The code is accessible in the same package and subclasses.