package Constructor;

public class Constructor_Copy {
    int a;
    String name;
    Constructor_Copy(){
        a=10;
        name="rohit";
        System.out.println(a+ " "+ name);
    }
    Constructor_Copy(Constructor_Copy ref){
        a = ref.a;
        name= ref.name;
        System.out.println(a+ " "+ name);
    }

    public static void main(String[] args) {
        Constructor_Copy obj = new Constructor_Copy();
        Constructor_Copy obj2 = new Constructor_Copy(obj);
    }
}
