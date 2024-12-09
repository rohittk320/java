
import java.util.Arrays;
public class Arraymethod {
    public static void main(String[] args) {
        String str[] = {"apple","orange","banana","lichi"};
        Arrays.fill(str,2,4,"kiwi");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        String str1[] = Arrays.copyOf(str,4);
        for (int j = 0; j < str1.length; j++) {
            System.out.println(str1[j]);
        }
        int arr[] = {4,2,1,9,6,7,8};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] +" ");
            }
        }
    }

