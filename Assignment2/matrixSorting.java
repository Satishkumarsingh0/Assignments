/*
2. Write a program to sort matrix
Input :
1 5 6
4 3 8
9 7 2
Output :
1 2 3
4 5 6
7 8 9
*/
import java.util.Arrays;
public class matrixSorting {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 6},{4, 3, 8},{9, 7, 2}};

        int size = matrix.length;
        int[] temp = new int[size * size];
        int i=0,j=0,k = 0;

        System.out.println("Input: ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                temp[k++] = matrix[i][j];
            }
        }
        Arrays.sort(temp);
        k = 0;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                matrix[i][j] = temp[k++];
            }
        }
        System.out.println("Output: ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
