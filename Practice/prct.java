package Practice;
public class prct {
    private int age;
    private String name;

    public int  s1() {
        return age;
    }

    public String s2() {
        return name;
    }

    void setter(int x, String y) {
        this.age = x;
        this.name = y;

    }
}
class B {
    public static void main(String[] args) {
        prct obj = new prct();
        obj.setter(20,"Tony");
        System.out.println(obj.s1());
        System.out.println(obj.s2());
    }
}
