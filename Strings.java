public class Strings {
    public static void main(String[] args) {
        String x = "hello World";
        String y = "hello";
        boolean z = x.equals(y);
        System.out.println(z);

        x.substring(0,5);  // do not change bcoz string is immutable
        System.out.println("string = "+ x);
        String str = x.substring(0,5);
        System.out.println(str);

        char ch = x.charAt(1);
        System.out.println(ch);

        int point  = x.codePointAt(0);  // return unicode value
        System.out.println(point);

        int code = x.codePointBefore(1);
        System.out.println(code);

        System.out.println(x.contains("he")); // true

        boolean coc = x.contentEquals("hello"); //false
        System.out.println(coc);

        System.out.println(x.endsWith("ld"));
    }
}
