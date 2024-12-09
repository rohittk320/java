package Practice;
public class prt {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9};
        int n = 3;
        for (int i = 0; i < n; i++) {
            int last = num[num.length-1];
            for (int j = num.length-1; j > 0; j--) {
                num[j] = num[j-1];
            }
            num[0] = last;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}