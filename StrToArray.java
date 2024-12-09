import java.util.*;

public class StrToArray {
    public static void main(String[] args) {
        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();
        System.out.println(myArray[0]);
        for (char i : myArray) {
            System.out.println(i);
        }
        String str = "Converting string to string array using split method";
        String[] strArray = str.split("\\s");
        for (String x : strArray) {
            System.out.println(x);
        }
        String arr[] = {"ram", "krishn", "ravan", "arjun"};
        System.out.println(arr[0]); // array
        String str1 = Arrays.toString(arr);
        System.out.println(str1); // string

        int num = 123456789;
        //   int[] num1 = num
    }
}