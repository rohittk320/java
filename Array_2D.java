public class Array_2D {
    public static void main(String[] args) {

        int x[][] = {
                {1, 2, 13, 4, 5},
                {8, 7, 3, 0, 2}
                }; //2*5
        int y[][] = {
                {1, 2, 13, 4, 5, 7},
                {8, 7, 3, 0, 2, 9},
                {18, 7, 13, 0, 21, 3},
                {1, 2, 13, 4, 5, 7},
                {8, 7, 3, 0, 2, 9}
                 };//5*6
        for (int i = 0; i < 5; i++) {  // row
            for (int j = 0; j < 6; j++) {  // coloum
                System.out.print(y[i][j] + " ");
            }

        }

    }
}