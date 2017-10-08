/**
 * Created by 0mer on 08/10/2017.
 */
public class C1_7 {


    public static void setToZero(int[][] matrix, int m, int n){
        int i,j;
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(i = 0 ; i < m ; i++){
            for(j = 0 ; j < n ; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(i = 0 ; i < m ; i++){
            for(j = 0 ; j < n ; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }



    public static void main(String[] args) {
        int m = 3 , n = 4;
        int[][] matrix = new int[m][n];
        matrix[0][0] = 0;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 0;
        matrix[1][3] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        matrix[2][3] = 9;
        System.out.println("Before:");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        setToZero(matrix,m,n);
        System.out.println("After:");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
