// С Толиковой поощью.
package fibonacci;

import java.io.IOException;
import java.util.Scanner;

public class FirstFibonacci {
    public static void main(String... args) throws IOException {
        while (true) {
            System.out.println("How much Fibonacci numbers you want to see?");
            long quantity;
            try {
                Scanner scanner = new Scanner(System.in);
                quantity = scanner.nextInt();
            } catch (RuntimeException e) {
                continue;
            }
            if (quantity == 0) {
                System.out.println("Bravo! That's your 0 Fibonacci numbers!");
                System.out.println("Well done!");
                break;
            } else if (quantity == 1) {
                System.out.println("Your dear Fibonacci numbers: 0.");
                System.out.println("That's all!");
                break;
            } else if (quantity == 2) {
                System.out.println("Your dear Fibonacci numbers: 0, 1.");
                System.out.println("That's all!");
                break;
            } else if (quantity == 3) {
                System.out.println("Your dear Fibonacci numbers: 0, 1, 1.");
                System.out.println("That's all!");
                break;
            } else if (quantity < 3)
                continue;
            System.out.print("Your dear Fibonacci numbers: ");
            long oldNewYear, newNewYear = 0, value = 1;
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
            break;
        }
    }
}