public class prct1 {
    public static void main(String[] args) {
        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(myArray);

        String myStr = "Hello, World!";
        myStr.getChars(7, 12, myArray, 4);
        System.out.println(myArray);
    }
}
