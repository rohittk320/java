package Practice;

public class Recurs {
    static int pow (int x, int n){
        if (n>0){
            return x*pow(x,n-1);
        }
        else {
            return 1;
        }

    }
    public static void main(String[] args) {
        int xyz=pow(3,4);
        System.out.println(xyz);
    }
}
