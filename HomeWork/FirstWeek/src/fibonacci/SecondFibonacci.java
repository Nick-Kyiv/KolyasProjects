//Без него.
package fibonacci;

import java.io.IOException;
import java.util.Scanner;

public class SecondFibonacci {
    public static void main(String[] args) throws IOException {
        System.out.println("How much FirstFibonacci numbers you want to see?");
        long quantity, oldNewYear = 0, newNewYear = 0, value = 1;
        Scanner scanner = new Scanner(System.in);
        quantity = scanner.nextInt();
        if (quantity == 0) {
            System.out.println("Bravo! That's your 0 FirstFibonacci numbers!");
            System.out.print("Well done!");
        } else if (quantity == 1) {
            System.out.println("Your dear FirstFibonacci numbers: 0.");
            System.out.print("That's all!");
        } else if (quantity == 2) {
            System.out.println("Your dear FirstFibonacci numbers: 0, 1.");
            System.out.print("That's all!");
        } else if (quantity > 2) {
            System.out.print("Your dear FirstFibonacci numbers: ");
            for (long i = 0; i < quantity - 2; i++) {
                oldNewYear = newNewYear;
                newNewYear = value;
                value = oldNewYear + newNewYear;
                if (i == 0)
                    System.out.print("0, 1, ");
                System.out.print(value);
                if (i < quantity - 3)
                    System.out.print(", ");
                else {
                    System.out.println(".");
                    System.out.println("That's all!");
                }
            }
        } else {
            System.out.println("???WHAT??? OK... It's your last chance!!! How much FirstFibonacci numbers you want to see??! [ > 2]");
            Scanner scanner2 = new Scanner(System.in);
            long quantity2 = scanner2.nextInt();
            if (quantity > 0) {
                System.out.println("Your dear FirstFibonacci numbers!");
                for (long i = 0; i < quantity2 - 2; i++) {
                    oldNewYear = newNewYear;
                    newNewYear = value;
                    value = oldNewYear + newNewYear;
                    if (i == 0)
                        System.out.print("0, 1, ");
                    System.out.print(value);
                    if (i < quantity2 - 3)
                        System.out.print(", ");
                    else {
                        System.out.println(".");
                        System.out.println("That's all!");
                    }
                }
            }
        }
    }
}