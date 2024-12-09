package Constructor;

public class Oops_constructor_1 {   // purpose initializing the object(value)
        int a;
        String b;
        int c;
        public Oops_constructor_1() {
            a = 30;
            b = "Tilak";
            c = 25;
            System.out.println(a);
        }
        public static void main(String[] args) {
            Oops_constructor_1 obj3 = new Oops_constructor_1();  // call automatically only one time
            System.out.println(obj3.a);//   System.out.println(obj3.b);
            System.out.println(obj3.c);

         //   obj3.Construct1 --> No need to write

        }
    }
    //Note that the constructor name must match the class name, and it cannot have a return type (like void)