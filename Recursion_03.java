public class Recursion_03 {
    static void addsum(int i, int n, int sum) {
         if (i==n){
             sum += i;
             System.out.println(sum);
             return;
         }
         sum += i;
         addsum(i+1,n,sum);

    }
    public static void main(String[] args) {
        addsum(1,5,0);
    }
}