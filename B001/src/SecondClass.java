import java.util.Arrays;

public class SecondClass {
    public static void main(String[] args) {
        int[] arr = {-128, 3, 1, 6, 7, 3, 5, 5, 4, 5, 127, 7};
        arr[1] = arr[0];
        System.out.println("Array: " + Arrays.toString(arr));
        int max = arr[0], sumOfArrValues = 0, min = arr[0], crossMax = 0, crossMin = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sumOfArrValues += i;
            if (max < arr[i]) {
                max = arr[i];
                crossMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                crossMin = i;
            }
        }
        System.out.println("Sum of all numbers in an array is " + sumOfArrValues + ".");
        System.out.println("Max_Value_In_Arr " + max + ".");
        System.out.println("Min_Value_In_Arr " + min + ".");
        int firstPartSum = 0, secondPartSum = 0;
        for (int h = 0; h < arr.length / 2; h++) {
            firstPartSum += arr[h];
        }
        for (int j = arr.length - 1; j > arr.length / 2 - 1; j--) {
            secondPartSum += arr[j];
        }
        System.out.println("1_part_sum = " + firstPartSum);
        System.out.println("2_part_sum = " + secondPartSum);
        int newArr[] = {firstPartSum, secondPartSum}, numberOfSums = 0, bigger_half_sum = 0;
        for (int a = 0; a < newArr.length; a++) {
            if (newArr[a] > bigger_half_sum) {
                bigger_half_sum = newArr[a];
                numberOfSums = a + 1;
            }
        }
       /* String ending1 = new String("st");
        String ending2 = new String("nd");
        String ending3 = new String("rd");
        String endingElse = new String("th");  */
        String ending;
        switch (numberOfSums) {
            case 1:
                ending = "st";
                break;

            case 2:
                ending = "nd";
                break;
            case 3:
                ending = "rd";
                break;
            default:
                ending = "th";
        }

        System.out.println("bigger_half_sum is " + bigger_half_sum + ", so it's " + numberOfSums + ending + "part sum.");

    }
}
