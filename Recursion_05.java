public class Recursion_05 {
 static int power(int x, int n){
     if (n>0){
         return x*power(x,n-1); // 2*2*2*2*2*1=32
     }
     else {
         return 1;
     }
  }
    public static void main(String[] args) {
        int ans = power(2,5);
        System.out.println(ans);
    }
}
