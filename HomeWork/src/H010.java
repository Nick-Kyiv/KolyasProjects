package src;

//- сортировать массив двумя разными способами

import java.util.Arrays;

public class H010 {
    public static void main(String[] args) {
        int[] arr = {123, 1, -8, 87, 789676, -8768880};
        System.out.println("Before: " + Arrays.toString(arr) + ".");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int big = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = big;
                }
            }
        }

        System.out.println("After: " + Arrays.toString(arr) + ".");
        int haHa = arr[0], iHa_ha = 0, big;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (haHa <= arr[j]) {
                    haHa = arr[j];
                    iHa_ha = j;
                }
            }
            big = arr[i];
            arr[i] = arr[iHa_ha];
            arr[iHa_ha] = big;
            haHa = arr[i + 1];
        }
        System.out.println("After after: " + Arrays.toString(arr) + ".");
    }
}

