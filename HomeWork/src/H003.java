package src;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//- скопировать данные из первого массива во второй.
//- есть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива который получается в результате суммы arr1[i] + arr2[i]
//- Заполнить двухмерный массив случайными числами
//- инвертировать массив в обратном направлении
public class H003 {
    public static void main(String... args) throws IOException, RuntimeException {
        while (true) {
            System.out.println("How many variables will be in your arr1?");
            int lengthUnique;
            try {
                Scanner scanner = new Scanner(System.in);
                lengthUnique = scanner.nextInt();
            } catch (RuntimeException e) {
                continue;
            }
            if (lengthUnique <= 0)
                continue;
            int number;
            Random generator;
            int[][] arrRandom = new int[lengthUnique][lengthUnique];
            generator = new Random();
            //есть два массива одинаковой длины arr1 и arr2...
            int[] arr1 = new int[lengthUnique], arr2 = new int[lengthUnique];
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("What value of " + i + " variable ?");
                try {
                    Scanner scannerUnique = new Scanner(System.in);
                    arr1[i] = scannerUnique.nextInt();
                } catch (RuntimeException e) {
                    continue;
                }
                if (arr1[i] <= 0)
                    continue;
            }
            int[] sumArr = new int[lengthUnique];
            for (int i = 0; i < lengthUnique; i++) {
                for (int j = 0; j < lengthUnique; j++) {
                    number = generator.nextInt(lengthUnique * 100);

                    arrRandom[i][j] = number;
                }
            }
            //- скопировать данные из первого массива во второй.
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
            System.out.println("Array_1: " + Arrays.toString(arr1));
            System.out.println("Array_2: " + Arrays.toString(arr2));
            //- инвертировать массив в обратном направлении
            int numerator = 0;
            for (int i = lengthUnique - 1; i >= 0; i--) {
                // я использовал arr2 в качестве копии arr1
                arr1[numerator] = arr2[i];
                numerator++;
            }
            //- есть два массива одинаковой длины arr1 и arr2 вывести
            // в консоль значения массива который получается в результате
            // суммы arr1[i] + arr2[i]
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arrRandom[i][i];

                sumArr[i] = arr1[i] + arr2[i];
            }

            System.out.println("invert_of_Array_1: " + Arrays.toString(arr1));
            System.out.println("arr1: " + Arrays.toString(arr1));
            System.out.println("arr2: " + Arrays.toString(arr2));
            System.out.println("sumArr(arr1[i] + arr2[i]):" + Arrays.toString(sumArr));
            System.out.println("arrRandom[][]: ");
            for (int i = 0; i < lengthUnique; i++) {
                for (int j = 0; j < lengthUnique; j++) {
                    if (i != lengthUnique - 1 || j != lengthUnique - 1)
                        System.out.print(arrRandom[i][j] + ", ");
                    else
                        System.out.println(arrRandom[i][j] + ".");
                }
                System.out.println();
            }
            break;
        }

    }
}

