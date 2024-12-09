package Constructor;

public class prac {
    int age;
    String name;
    prac(int x,String y){
        this.age=x;
        this.name=y;
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        prac obj = new prac(10,"Rohit");
    }
}
