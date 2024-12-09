public class Array_3D {
        public static void main(String[] args) {
            int x[][][]={
                    {{1,2,13,4,0},{1,2,13,4,5},{1,2,13,4,0},{1,2,13,4,5}},
                    {{8,7,3,0,2},{18,7,3,10,2},{1,2,13,4,0},{1,2,13,4,5}},
                    {{8,7,3,0,2},{8,7,3,0,2},{1,2,13,4,0},{1,2,13,4,5}}
                     }; //3*4*5
            //System.out.println(x[1][1][0]+" ");
            for (int i=0;i<3;i++){
                for (int j=0;j<4;j++){
                    for (int k=0;k<5;k++){
                        System.out.print(x[i][j][k]+" ");
                    }
                }
            }

        }

    }

