public class Array_prime {
        public static void main(String[] args) {
            int x[]={1,5,9,7,13,15,24,23};
            for (int i=0; i < x.length; i++){
                int temp=0;
                if(x[i]==0 || x[i]==1){
                    System.out.println("Not Prime "+x[i]);
                }
                if (x[i]>1){
                    for (int a=2; a<x[i]; a++){
                        if (x[i]%a==0){
                            temp=1;
                            break;
                        }
                    }
                    if(temp==1) {
                        System.out.println("Not Prime "+x[i]);
                    }
                    else {
                        System.out.println("Prime "+x[i]);
                    }
                }
            }
        }
    }