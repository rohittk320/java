public class ArrayFrequency {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,10,10,20,20,30};
        int visited = -1;
        int freq[] = new int [arr.length];
        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
                if (freq[i] != visited) {
                    freq[i] = count;
                }
            }
        }
        System.out.println();
    }
}
