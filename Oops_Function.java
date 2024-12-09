
    public class Oops_Function {
       int a = 10;
       String name = "Rohit";
       static int b=20;

        static void Tilak(){  //static method , direct call
            System.out.println("Twinckle Twinclke Little Star "+ b); //  access only static variable
        }

        static void Tilak1(){
            System.out.println("Hello Star");
        }

        //Public method // need to creat object , object required
        public void Tilak2(){
            System.out.println("Hello World "+ this.a);
            System.out.println("Hello Tilak "+ this.b);
        }
        public static void main(String[] args) {
            Tilak();
            Tilak1();  // direct call
            Oops_Function Object1 = new Oops_Function(); // creat object
            Object1.Tilak2();
        }
    }