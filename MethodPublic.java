 class MethodPublic {
 public int add(int a, int b){
     int x = a+b;
     System.out.println(x);
     return x;
 }
 public void squre(int num){
     int y = num*num;
     System.out.println(y);
 }

 public static void main(String[] args) {
         MethodPublic obj = new MethodPublic();  // need to creat object
         obj.add(10,20);
         obj.squre(10);
     }
}
