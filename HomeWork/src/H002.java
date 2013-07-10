package src;

//- вывести первую половину массива.
//- вывести вторую половину массива.
//- максимальное и минимальное значение в одномерном массиве, и поменять их местами
public class H002 {
    public static void main(String[] args) {
        int[] arr = {-128, -0, +127, -6};
        int max = arr[0], min = arr[0], iMax = 0, iMin = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
                iMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                iMin = i;
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
        System.out.println("max value in array is " + max + ".");
        System.out.println("min value in array is " + min + ".");
        arr[iMin] = max;
        arr[iMax] = min;
        System.out.println("changedMin = " + arr[iMin] + ".");
        System.out.println("changedMax = " + arr[iMax] + ".");
    }
}

