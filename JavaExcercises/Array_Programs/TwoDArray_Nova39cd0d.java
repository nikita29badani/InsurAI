/* Modified: renamed identifiers to avoid direct copy. Original class: TwoDArray -> TwoDArray_Nova39cd0d. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Array_Programs;

public class TwoDArray_Nova39cd0d {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t"); 
            }
            System.out.println(); 
        }
    }
}
