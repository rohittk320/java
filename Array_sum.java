public class Array_sum {
    public static void main(String[] args) {
        int a[] = {2,3,5,4};
        int b[] = {1,2,3,4};
        int c[] = new int[a.length];
        for (int i = 0; i < a.length ; i++) {
            c[i] = a[i] + b[i];
            System.out.print(c[i]+" ");
        }
    }
}
