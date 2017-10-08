/**
 * Created by 0mer on 08/10/2017.
 */
public class C1_6 {

    public static void rotateNotInPlace(int[][] matrix, int n){
        int[][] newMatrix = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                newMatrix[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(newMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotateInPlace(int[][] matrix, int n) {
        int tmp, offset;
        for(int i = 0 ; i < n/2 ; i++){
            for(int j = i ; j < n-1-i ; j++){
                offset = j-i;
                tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i-offset][i];
                matrix[n-1-i-offset][i] = matrix[n-1-i][n-1-i-offset];
                matrix[n-1-i][n-1-i-offset] = matrix[j][n-1-i];
                matrix[j][n-1-i] = tmp;
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m = new int[3][3];
        m[0][0] = 1;
        m[0][1] = 2;
        m[0][2] = 3;
        m[1][0] = 4;
        m[1][1] = 5;
        m[1][2] = 6;
        m[2][0] = 7;
        m[2][1] = 8;
        m[2][2] = 9;
        rotateNotInPlace(m,3);
        rotateInPlace(m,3);
    }
}
