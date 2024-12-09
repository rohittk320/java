public class MaxArray {
    public static void main(String[] args) {
        int arr[] = {4,6,5,8,7,9,2,1};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}