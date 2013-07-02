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
          //... случайными числами
            int number;
            Random generator;
            int[] arrRandom = new int[lengthUnique];
            generator = new Random();
          //есть два массива одинаковой длины arr1 и arr2... & скопировать данные...
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
                number = generator.nextInt(lengthUnique);
                for (int j = 0; j <= i; j++) {
                    if (number == arrRandom[j])
                        arrRandom[i] = number;
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
                sumArr[i] = arr1[i] + arrRandom[i];
            }
            System.out.println("Array_1: " + Arrays.toString(arr1));
            System.out.println("Array_2: " + Arrays.toString(arr2));
            //- инвертировать массив в обратном направлении
            int numerator = 0;
            for (int i = lengthUnique -1; i >= 0; i--) {
            // я использовал arr2 в качестве копии arr1
                arr1[numerator] = arr2[i];
                numerator++;
            }
            System.out.println("invert_of_Array_1: " + Arrays.toString(arr1));
            break;

        }

    }
}

