public class C004 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[][] array = {{2, 3}, {3, 6}};
        int sumOfMatrixEl = 0, n = 0, max = array[0][0], sum_half = 0, sum_diag = 0, min = array[0][0], iMin1 = 0, iMin2 = 0, iMax1 = 0, iMax2 = 0;
        for (int numerator = 0; numerator < array.length; numerator++) {
            for (int number = 0; number < array[numerator].length; number++) {
                sumOfMatrixEl += array[numerator][number];
                sum_diag += array[numerator][number];
                if (max < array[numerator][number]) {
                    max = array[numerator][number];
                    iMax1 = numerator;
                    iMax2 = number;
                }
                if (min > array[numerator][number]) ;
                {
                    min = array[numerator][number];
                    iMin1 = numerator;
                    iMin2 = number;
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    for (int j = 0; j <array.length; j++) {
                        sum_half += array[j][j];
                    }
                }
            }
            System.out.println("max = " + max);
            System.out.println("min = " + min);
            max = array[iMin1][iMin2];
            min = array[iMax1][iMax2];
            max = min - max;
            min = min - max;
            max = min + max;
            int i;
            i = max;
            max = min;
            min = i;
            System.out.println("sumOfMatrixEl = " + sumOfMatrixEl);
            System.out.println("changed max = " + max + '\n' + "changed min = " + min);
        }
    }
}
