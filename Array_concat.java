public class Array_concat {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 6, 3};
        int b[] = {7, 8, 9, 6, 5};
        int ln = a.length + b.length;
        int result[] = new int[ln];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
