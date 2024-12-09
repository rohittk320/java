public class StringPalindrome {
    public static void main(String[] args) {
        String x = "Tilak Mahore";
        String rev = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            rev = rev + x.charAt(i);
        }
        System.out.println(rev);
        if (x == rev) {
            System.out.println("Palindrome " + rev);
        } else {
            System.out.println("not Palindrome " + rev);
        }

        java.lang.StringBuilder str1 = new java.lang.StringBuilder("Hello World");
        java.lang.StringBuilder reverse = new java.lang.StringBuilder("");
        //System.out.println(Str1.charAt(0));
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse.append(str1.charAt(i));
        }
        System.out.println(reverse);
    }
}

