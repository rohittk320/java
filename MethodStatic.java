 class MethodStatic {
    static void s1(int x){
        System.out.println(x);
    }
     public static void main(String[] args) {
         MethodStatic.s1(52);  // direct call . no need to creat object
         s1(40);
     }
}
