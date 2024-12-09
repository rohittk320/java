package Constructor;

public class Oops_Constructor_3 {
        int age = 75; // global varible
        String name ; // global varible
        public Oops_Constructor_3(int b,String c) {   // b,c = local varible
            System.out.println(age);
            this.age=b;
            this.name=c;
            System.out.println("local varible output");
            System.out.println(b);
            System.out.println(c);
        }
        public static void main(String[] args) {
            Oops_Constructor_3 obj3 = new Oops_Constructor_3(100,"Tilak Mahore");
            System.out.println("Global varible output");
            System.out.println("age is "+ obj3.age);
            System.out.println("name is "+ obj3.name);

        }

}
