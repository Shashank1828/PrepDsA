package array;

import java.util.Arrays;


public class q867 {
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3},
            {4,5,6}
        };

        int[][] transposedMatrix = transposeMatrix(matrix);

        // Display the transposed matrix
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] target = new int[col][row]; // Transposed matrix

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                target[j][i] = matrix[i][j]; // Transpose elements
            }
        }

        return target; // Return the transposed matrix
    }
}
 
