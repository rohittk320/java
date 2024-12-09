package Constructor;

public class Constructor_Perameterize {
    int age;
    String name;
     Constructor_Perameterize(int x, String y){
         this.age=x;
         this.name=y;
         System.out.println(x);
         System.out.println(y);
    }
    public static void main(String[] args) {
        Constructor_Perameterize obj = new Constructor_Perameterize(100,"Rohit");
        Constructor_Perameterize obj1 = new Constructor_Perameterize(200,"thakur");
        Constructor_Perameterize obj2 = new Constructor_Perameterize(300,"virat");
    }
}
