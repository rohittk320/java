package StringBuilder;

public class Str {
    public static void main(String[] args) {
     String x = "Rohit";   // literal
        System.out.println(x);
     String y = "Rohit";   // refer string x object
        System.out.println(y);

        x.concat("Thakur"); // does not work bcoz string is immutable (string does not change)
        System.out.println(x);

     String str = x.concat("Thakur");  // string changed bcoz new string object created
        System.out.println(str);

        System.out.println(x);
        System.out.println(y);

        // string with new keybord object
     String a = new String("Virat");
        System.out.println(a);

     String b = new String("Virat");
        System.out.println(b);

        a.concat("Kohli");  // does not work bcoz string is immutable (string does not change)
        System.out.println(a);

        a=a.concat("Kohli");
        System.out.println(a);
    }
}
