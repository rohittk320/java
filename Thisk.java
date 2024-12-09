class abc {
    int x;
    String name;
    public void fun() {
        System.out.println(this.name);
    }
}
    public class Thisk {
        public static void main(String[] args) {
            abc obj = new abc();
            obj.name = "Rohit";
            obj.fun();
    }
}
