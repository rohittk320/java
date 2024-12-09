public class Array_duplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,2,5,6,4,5,8,};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] == arr[j] ) {
                   int x = arr[j];
                   System.out.println(x+" ");

                }
            }
        }
    }
}