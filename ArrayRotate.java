public class ArrayRotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int temp = arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=temp;
        for (int x : arr){
            System.out.println(x);
        }
     }
}
//public class Main {
//    public static void rotateLeftByOne(int[] arr) {
//        int temp = arr[0]; // Store the first element
//        for (int i = 0; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1]; // Shift elements to the left
//        }
//        arr[arr.length - 1] = temp; // Place the first element at the end
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        rotateLeftByOne(arr);
//
//        // Print the rotated array
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//    }
//}

