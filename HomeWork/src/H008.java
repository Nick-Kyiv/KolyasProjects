package src;

public class H008 {
    public static void main(String[] args) {
        int[][] matrix1 = {{3, 2, 3}, {4, 3, 6}, {3, 8, 3}},
                matrix2 = {{1, 3, 3}, {3, 5, 3}, {7, 3, 9}},
                matrixFin = new int[matrix1.length][matrix2[0].length];
        System.out.println("matrix1:");
        for (int[] aMatrix : matrix1) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + " ");
            }
            System.out.println("");
        }
        System.out.println("matrix2:");
        for (int[] aMatrix : matrix2) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                matrixFin[i][j] = sum;
            }
        }
        System.out.println("matrixFin:");
        for (int[] aMatrix : matrixFin) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + " ");
            }
            System.out.println("");
        }
    }
}

