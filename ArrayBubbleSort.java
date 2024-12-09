public class ArrayBubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 1, 3, 4, 2};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i]; // temp= 5;
                    arr[i] = arr[j]; // arr[0]= 6;
                    arr[j] = temp;  // arr[1]= 5;
                }
                //  if (i == arr[1]) {
                //   break;
                //  }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n"+arr[1]); // Second largest number
    }
}
