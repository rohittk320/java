package inheritence;

 class A {
     void method1() {
         System.out.println("method..1");
     }
    public void method2() {
         System.out.println("method..2");
     }
}
 class single_inheri extends A {
    public static void main(String[] args) {
        single_inheri obj = new single_inheri();
        obj.method1();
        obj.method2();
    }
}