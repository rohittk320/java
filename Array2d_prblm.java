public class Array2d_prblm {
        public static void main(String[] args) {
            int x[][]={ {1,2,13,4,5},{8,7,3,0,2} }; //2*5
            int y[][]={
                    {1,2,13,4,5,7},
                    {8,7,3,0,2,9},
                    {18,7,13,0,21,3},
                    {1,2,13,4,5,7},
                    {8,7,3,0,2,9},
                    {18,7,13,0,21,3}
                    };//6*6
            for (int i=0;i<6;i++){  // row
                for (int j=0;j<6;j++){ // colom
                    if (y[i][j]%2!=0){ // element
                        System.out.println("Even "+y[i][j]+" ");
                    }
                    else{System.out.println("Odd "+y[i][j]+" ");}
                }

            }

        }
    }

