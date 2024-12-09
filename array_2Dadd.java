public class array_2Dadd {
        public static void main(String[] args) {
            int x[][]={{1,2,3,4},{4,9,7,3}};
            int y[][]={{9,0,3,5},{1,9,8,2}};
            for (int i=0;i<2;i++){
                for (int j=0;j<4;j++){
                    System.out.print(x[i][j]+y[i][j]+" ");
                }
            }
        }
    }