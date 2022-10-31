import java.util.*;

public class MultMatrius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowsA, colsA, rowsB, colsB;
        System.out.print("Dimensions of matrix A: ");
        rowsA = sc.nextInt();
        colsA = sc.nextInt(); sc.nextLine();
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Values of matrix A: ");
        /*
          Save values of matrix A
          First(): Value of row 1
          Next(): Value of row 2
          Last(): Value of last row
          Reccoregut
         */
        for (int i = 0; i < rowsA; i++) {
            /*
              Save values of matrix A
              First(): Value of column 1, row 1
              Next(): Value of column 2, row1
              Last(): Value of last column, last row
              Reccoregut
             */
            for (int j = 0; j < colsA; j++)
                matrixA[i][j] = sc.nextInt();
        }
        
        rowsB = colsA;
        System.out.print("Enter columns of matrix B: ");
        colsB = sc.nextInt(); sc.nextLine();
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Values of matrix B: ");
        /*
          Save values of matrix B
          First(): Value of row 1
          Next(): Value of row 2
          Last(): Value of last row
          Reccoregut
         */
        for (int i = 0; i < rowsB; i++) {
            /*
              Save values of matrix B
              First(): Value of column 1, row 1
              Next(): Value of column 2, row1
              Last(): Value of last column, last row
              Reccoregut
             */
            for (int j = 0; j < colsB; j++)
                matrixB[i][j] = sc.nextInt();
        }

        int[][] multiplied_matrix = multiplica(rowsA, colsA, colsB, matrixA, matrixB);

        System.out.println("Result of A * B is:");
        /*
          Print value of matrix
          First(): First row
          Next(): Second row
          Last(): Last row
          Reccoregut
         */
        for (int i = 0; i < rowsA; i++)
            System.out.println(Arrays.toString(multiplied_matrix[i]));
    }

    /**
     * Multiplies 2 matrices
     * @param n Rows in matrix A
     * @param m Columns in matrix A and rows in matrix B
     * @param k Columns in matrix B
     * @param A Matrix A
     * @param B Matrix B
     * @return Matrix A * B
     */
    static int[][] multiplica(int n, int m, int k, int[][] A, int[][] B) {
        int[][] multiplied_matrix = new int[n][k];
        /*
          Iterate through rows of matrix A
          First(): Row 1
          Next(): Row 2
          Last(): Last row
          Reccoregut
         */
        for (int i = 0; i < n; i++) {
            /*
              Iterates through columns of matrix B
              First(): Column 1
              Next(): Column 2
              Last(): Last column
              Reccoregut
             */
            for (int j = 0; j < k; j++) {
                /*
                  Iterate through rows of matrix B / columns of matrix A
                  First(): Row 1 & Column 1
                  Next(): Row 2 & Column 2
                  Last(): Last row & Last column
                  Reccoregut
                 */
                for (int l = 0; l < m; l++)
                    multiplied_matrix[i][j] += A[i][l] * B[l][j];
            }
        }
        return multiplied_matrix;
    }
}
