public class Duplicate_remove {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,2,3};
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] != arr[j]) {
                    temp[i] = arr[j];
                }
               }
            }
        for (int j = 0; j < temp.length; j++) {
            System.out.print(temp[j]);
        }
    }
}
