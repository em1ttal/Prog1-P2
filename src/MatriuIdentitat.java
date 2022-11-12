import java.util.Scanner;

public class MatriuIdentitat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dim;
        /*
          Asks for new matrices
          First(): first matrix
          Next(): sc.nextInt()
          Last(): dim == 0
          Cerca: Matrix of dimension 0
         */
        do {
            System.out.print("Size of matrix: ");
            dim = sc.nextInt();
            int[][] matrix = new int[dim][dim];
            System.out.println("Enter matrix:");
            /*
              Asks for matrix values
              First(): element [0][0]
              Next(): next element
              Last(): element[dim][dim]
              Recorregut
             */
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++)
                    matrix[i][j] = sc.nextInt();
            }
            if(dim != 0) {
                if (checkIdentitat(matrix))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        } while(dim != 0);
    }

    /**
     * Checks whether matrix is identity matrix
     * @param tauler matrix
     * @return identity matrix?
     */
    static boolean checkIdentitat(int [][] tauler) {
        /*
          Checks matrix values
          First(): element [0][0]
          Next(): next element
          Last(): element[dim][dim] != value of identity matrix
          Cerca: Element of matrix is not value in identity matrix
         */
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                if (i == j && tauler[i][j] != 1)
                    return false;
                else if (i != j && tauler[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}
