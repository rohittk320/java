public class Array_swaping {
    public static void main(String[] args) {
        System.out.println("before swaping");
        int arr[] = {2, 3, 6, 5, 8, 1};
        for (int i : arr) {
              System.out.print(i +" ");
        }
        System.out.println("\nafter Swapping");
        int temp = arr[1];
         arr[1] = arr[4];
         arr[4] = temp;
         for (int i : arr){
             System.out.print(i+" ");
         }
    }
}