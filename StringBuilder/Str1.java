package StringBuilder;

public class Str1 {
    public static void main(String[] args) {
        String a= "Rohit";
        String b= new String("Rohit");

        if (a==b) {  // compare variable
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (a.equals(b)) {  // compare only value
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        String c = "  virat  ";
        String str = c.trim();
        System.out.println(str);
        System.out.println(str.toUpperCase());  // if you want to use string method every time you have to store string value in new variable
        System.out.println(str.indexOf("r"));
        System.out.println(str.charAt(1));
        System.out.println(str.replace("v","V"));

        int x = 10;
        String s = String.valueOf(x);  // convert number into string
    //    String s1 = Integer.toString(x);
        System.out.println(s+20);

    }
}
