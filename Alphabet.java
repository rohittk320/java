public class Alphabet {
    public static void main(String[] args) {

        char ch = 'y';

        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        }
        else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}