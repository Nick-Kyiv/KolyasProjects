//- вывести первую половину массива.
//- вывести вторую половину массива.
//- максимальное и минимальное значение в одномерном массиве, и поменять их местами
public class H002 {
    public static void main(String[] args) {
        int[] arr = {-128, 3, 1, 6, 7, 3, 5, 5, 4, 5, 127, 7};
        int max = arr[0], min = arr[0], crossMax = 0, crossMin = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
                crossMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                crossMin = i;
            }
        }
        int firstPartSum = 0, secondPartSum = 0;
        for (int h = 0; h < arr.length / 2; h++) {
            firstPartSum += arr[h];
        }
        for (int j = arr.length - 1; j > arr.length / 2 - 1; j--) {
            secondPartSum += arr[j];
        }
        System.out.println("1_part_sum = " + firstPartSum);
        System.out.println("2_part_sum = " + secondPartSum);
        System.out.println("Max_Value_In_Arr " + max + ".");
        System.out.println("Min_Value_In_Arr " + min + ".");
        max = arr[crossMin];
        min = arr [crossMax];
        System.out.println("crossMin = " + min + ".");
        System.out.println("crossMax = " + max + ".");
    }
}
