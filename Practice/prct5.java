package Practice;

public class prct5 {
    int age;
    String name;
    private void prct5(int x, String y){
        this.age = x;
        this.name = y;
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
      prct5 obj = new prct5();
      obj.prct5(10,"rohit");
    }
}
