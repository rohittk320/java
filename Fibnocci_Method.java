public class Fibnocci_Method {
    static void tilak(int a,int b,int count){
        int c = a+b;
        System.out.print(a +" ");
        System.out.print(b +" ");
        while(count <= 8){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            count++;
        }
    }
    public static void main(String[] args) {
        tilak(0,1,1);
    }
}


