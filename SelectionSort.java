import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {9,8,7,1,3,6,5,4,2};
       int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                temp=arr[i];
            }
        }

    }
}
