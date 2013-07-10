package src;

import java.util.Arrays;

//- вывести в консоль элементы той половины массива у которой среднее арифметическое максимальное
//- найти среднее арифметическое в одномерном массиве состоящем из чисел
//- вывести в консоль сумму среднего арифметического первой половины + второй половины
public class H005 {
    public static void main(String[] args) {
        double sumOfArrValues = 0, firstPartSum = 0, secondPartSum = 0;
        double[] array = {2, 98, 7, 6, 8, -90, 887, 9};
        for (int i = array.length - 1; i >= 0; i--) {
            sumOfArrValues += array[i];
        }
        double arithmeticalMean = sumOfArrValues / array.length;
        arithmeticalMean = Math.round(arithmeticalMean * 100.0) / 100.0;
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Arithmetical mean is " + arithmeticalMean + ".");
        //- вывести в консоль сумму среднего арифметического первой половины + второй половины
        for (int h = 0; h < array.length / 2; h++) {
            firstPartSum += array[h];
        }
        for (int j = array.length - 1; j > array.length / 2 - 1; j--) {
            secondPartSum += array[j];
        }
        double arithmeticalMean_1 = firstPartSum / (array.length / 2);
        arithmeticalMean_1 = Math.round(arithmeticalMean_1 * 100.0) / 100.0;
        System.out.println("First part arithmetical mean is " + arithmeticalMean_1 + ".");
        double arithmeticalMean_2 = secondPartSum / (array.length / 2);
        arithmeticalMean_2 = Math.round(arithmeticalMean_2 * 100.0) / 100.0;
        System.out.println("Second part arithmetical mean is " + arithmeticalMean_2 + ".");
        System.out.println("1_part_sum = " + firstPartSum);
        System.out.println("2_part_sum = " + secondPartSum);
        System.out.println("Sum of First part arithmetical mean" + '\n' + "& Second part arithmetical mean is " + (arithmeticalMean_1 + arithmeticalMean_2));
        if (arithmeticalMean_1 > arithmeticalMean_2) {
            System.out.print("First part arithmetical mean >" + '\n' + "> Second part arithmetical mean." + '\n' + "First part of array: ");
            for (int j = 0; j < array.length / 2; j++) {
                System.out.print(array[j]);
                if (j != (array.length / 2) - 1) {
                    System.out.print("; ");
                } else {
                    System.out.println(".");
                }
            }
        } else if (arithmeticalMean_2 > arithmeticalMean_1) {
            System.out.print("First part arithmetical mean <" + '\n' + "< Second part arithmetical mean." + '\n' + "Second part of array: ");
            for (int j = array.length / 2; j < array.length; j++) {
                System.out.print(array[j]);
                if (j != array.length - 1) {
                    System.out.print("; ");
                } else {
                    System.out.println(".");
                }
            }
        } else
            System.out.println("Sorry, First part arithmetical mean =" + '\n' + "= Second part arithmetical mean... ");
    }
}

