package Constructor;

public class Constructor_UserDefine {
    int a;
    String name;
     Constructor_UserDefine() {
       System.out.println(a +" "+ name);  // automatic initialize value
    }
    public static void main(String[] args) {
        Constructor_UserDefine obj = new Constructor_UserDefine();
        System.out.println(obj.a + " " + obj.name) ;
    }
}
