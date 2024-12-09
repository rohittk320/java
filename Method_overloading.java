 class Method_overloading {
    void test(int a) {
        System.out.println("Array_user "+ a);
    }
    void test(double a){
        System.out.println("test2 "+ a);
    }

     public static void main(int b) {  // achive method overloading
         System.out.println(b);
     }
     public static void main(String[] args) {
         Method_overloading obj = new Method_overloading();
         obj.test(4.2);
         obj.main(4);
     }
}
