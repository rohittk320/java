package Constructor;
public class P_Constructor {
    int a;
    String name;

   private P_Constructor() {   // can not access by any other class
        a = 10;
        name = "tony";
        System.out.println(a + " " + name);
        }
        public static void main(String[] args) {
            P_Constructor obj = new P_Constructor();
        }
    }

//    class xyz {
//        public static void main(String[] args) {
//     P_Constructor xyz = new P_Constructor();   // can not acccess
//        }
//    }