class SuperKey {
    int x = 10;
    public void show() {
        System.out.println(" parent class ");
    }
}
class B extends SuperKey {
    int x = 20;
   public void show(){
       super.show(); // call parent class method
       System.out.println(x);
       System.out.println(super.x);  // call super variable
       System.out.println(" child class");
   }
}
class f1{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}