public class fibnacci {
   public static void main(String[] args) {
      int a = 0, b = 1, c, term = 10;
      for (int i = 1; i <=term ; i++) {
         System.out.print(a+" ");
         c=a+b; //0+1,1
         a=b;  //a=1,1
         b=c;  //b=1,2
      }
   }
}
