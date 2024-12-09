package Constructor;

public class Oops_Constructor_2 {
        int age;   // global varible
        String name ;   // global varible

        public Oops_Constructor_2(int b,String c){   // b,c = local varible
            this.age=b;
            this.name=c;
            System.out.println("local varible output");
            System.out.println(b);
            System.out.println(c);

        }
        public static void main(String[] args) {
           Oops_Constructor_2 obj3 = new Oops_Constructor_2(100,"Tilak Mahore"); // direct call
            System.out.println("Global varible output");
            System.out.println("age is "+ obj3.age);
            System.out.println("name is "+ obj3.name);
        }
    }
    //Note that the constructor name must match the class name, and it cannot have a return type (like void)
