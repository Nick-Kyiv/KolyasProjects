package src;
// - из трех чисел, заданных как переменные а0, а1, а2 - найти максимальное и минимальное значение.

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class H001 {
    public static void main(String... args) throws IOException, RuntimeException {
        while (true) {
            System.out.println("How many variables will be in your array? [3]");
            int h;
            try {
                Scanner scanner = new Scanner(System.in);
                h = scanner.nextInt();
            } catch (RuntimeException e) {
                continue;
            }
            if (h <= 0)
                continue;
            long array[] = new long[h], minValue = array[0], maxValue = array[0];
            int minValue_number = 0, maxValue_number = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.println("What value of a" + i + "?");
                Scanner scannerUnique = new Scanner(System.in);
                array[i] = scannerUnique.nextLong();
            }
            for (int numerator = 0; numerator < array.length; numerator++) {
                if (maxValue < array[numerator]) {
                    maxValue = array[numerator];
                    maxValue_number = numerator;
                }
                if (minValue > array[numerator]) {
                    minValue = array[numerator];
                    minValue_number = numerator;
                }
            }
            String min_ending, max_ending;
            switch (minValue_number) {
                case 1:
                    min_ending = "st";
                    break;

                case 2:
                    min_ending = "nd";
                    break;
                case 3:
                    min_ending = "rd";
                    break;
                default:
                    min_ending = "th";
            }
            switch (maxValue_number) {
                case 1:
                    max_ending = "st";
                    break;

                case 2:
                    max_ending = "nd";
                    break;
                case 3:
                    max_ending = "rd";
                    break;
                default:
                    max_ending = "th";
            }
            System.out.println("Array: " + Arrays.toString(array) + ".");
            System.out.println("Length is " + array.length + ".");
            System.out.println("maxValue = " + maxValue + ", it's " + maxValue_number + max_ending + " in the array.");
            System.out.println("minValue = " + minValue + ", it's " + minValue_number + min_ending + " in the array.");
            break;
        }
    }
}
