public class ArrayIteration {
    public static void main(String[] args) {
        int x[] = {5, 6, 7, 9, 1, 15, 4};
        for (int i = 0; i <= x.length ; i++) {
           // System.out.println(i);
            for (int j = 2; j <= x[i]; j++) {
                System.out.println(j);
            }
        }
    }
}
