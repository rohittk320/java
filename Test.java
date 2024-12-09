interface Test3 {
   void fun1();
}
interface Test2 {
    void fun2();
}
class Test implements Test3,Test2 {
    public void fun1() {
        System.out.println(" test 1");
    }
    public void fun2() {
        System.out.println(" test 2");
    }
    void fun3() {
        System.out.println(" test 3 ");
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.fun1();
        obj.fun2();
        obj.fun3();
    }
}