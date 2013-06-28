import java.io.IOException;
import java.util.Scanner;

public class StartClass {
    public static void main(String... args) throws IOException {
        while (true) {
            System.out.println("How much Fibonacci numbers you want to see? [>3]");
            long quantity;
            try {
                Scanner scanner = new Scanner(System.in);
                quantity = scanner.nextInt();
            } catch (RuntimeException e) {
                continue;
            }
            if (quantity < 3)
                continue;
            System.out.print("Your dear Fibonacci numbers: ");
            long  oldNewYear, newNewYear = 0, value = 1;
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