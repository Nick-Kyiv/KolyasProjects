package src;

import java.util.Arrays;

//- Найти максимальное и минимальное значение в двухмерном массиве и поменять их местами.
//- Повернуть матрицу(Двухмерный массив). Матрица квадратная.
//- Найти строку в двухмерном массиве, имеющую самую большую сумму элементов
//- Найти строку в двухмерном массиве, имеющую минимальную сумму элементов
//- Поменять местами самую большую и самую маленькою строку. (Из предыдущих двух заданий)
public class H007 {
    public static void main(String[] args) {
        int[][] matrix = {{3, -128, 8, 5}, {7, 998, 0, 7}, {-7, 9, 127, 8}, {+8, 22, 2, -7}},
                matrixClone = new int[matrix.length][matrix.length];
        int iMax1 = 0, iMin1 = 0, iMax2 = 0, iMin2 = 0, max = matrix[0][0], min = matrix[0][0], number1 = 0, number2 = 0, sum = 0;
        int[] sumArray = new int[matrix.length];
        System.out.println("matrix:");
        for (int numerator = 0; numerator < matrix.length; numerator++) {
            for (int num = 0; num < matrix[numerator].length; num++) {
                if (max < matrix[numerator][num]) {
                    max = matrix[numerator][num];
                    iMax1 = numerator;
                    iMax2 = num;
                }
                if (min > matrix[numerator][num]) {
                    min = matrix[numerator][num];
                    iMin1 = numerator;
                    iMin2 = num;
                }
                System.out.print(matrix[numerator][num] + " ");
                matrixClone[numerator][num] = matrix[numerator][num];
            }
            System.out.println("");
        }
        System.out.println("max value in matrix is " + max + ".");
        System.out.println("min value in matrix is " + min + ".");
        matrix[iMax1][iMax2] = min;
        matrix[iMin1][iMin2] = max;
        System.out.println("changed max value in matrix is " + matrix[iMax1][iMax2] + ".");
        System.out.println("changed min value in matrix is " + matrix[iMin1][iMin2] + ".");
        for (int numerator = 0; numerator < matrix.length; numerator++) {
            for (int num = matrix[numerator].length - 1; num >= 0; num--) {
                matrix[number1][number2] = matrixClone[num][numerator];
                number2++;
                if (num == 0)
                    number2 = 0;
            }
            number1++;
        }
        System.out.println("rotated matrix:");
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + " ");
            }
            System.out.println("");
        }
        for (int numerator = 0; numerator < matrix.length; numerator++) {
            for (int num = 0; num < matrix[numerator].length; num++) {
                matrixClone[numerator][num] = matrix[numerator][num];
                sum += matrix[numerator][num];
            }
            sumArray[numerator] = sum;
            sum = 0;
        }
        int minSum = sumArray[0], maxSum = sumArray[0], iMinSum = 0, iMaxSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (maxSum <= sumArray[i]) {
                maxSum = sumArray[i];
                iMaxSum = i;
            }
            if (minSum >= sumArray[i]) {
                minSum = sumArray[i];
                iMinSum = i;
            }
        }

        System.out.println("sumArray: " + Arrays.toString(sumArray) + ".");
        System.out.println("iMaxSum = " + iMaxSum + "." + '\n' + "iMinSum = " + iMinSum + ".");
        System.out.println("maxSum_string in matrix: " + Arrays.toString(matrix[iMaxSum]) + ".");
        System.out.println("minSum_string in matrix: " + Arrays.toString(matrix[iMinSum]) + ".");
        for (int i = 0; i < matrix.length; i++) {
            matrix[iMinSum][i] = matrixClone[iMaxSum][i];
            matrix[iMaxSum][i] = matrixClone[iMinSum][i];
        }
        System.out.println("changed rotated matrix:");
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + " ");
            }
            System.out.println("");
        }
    }
}
