package Practice;
public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,5,6,6};
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]!=arr[j]) {
                   temp[i]=arr[i];
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
