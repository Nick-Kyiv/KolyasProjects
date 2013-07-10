package src;

// - написать программу решение квадратного уравнения.

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class H004 {
    public static void main(String args[]) throws IOException {
        float a, b, c, d;
        double x1, x2;
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("What value of 'a' variable? [!=0]");
                a = s.nextFloat();
                if (a == 0) {
                    System.out.println("Oops?!. ERROR! (a = 0)");
                    break;
                }
                System.out.println("What value of 'b' variable?");
                b = s.nextFloat();
                System.out.println("What value of 'c' variable?");
                c = s.nextFloat();
                d = (b * b) - (4 * a * c);
                if (d < 0)
                    System.out.print("x є ǿ");
                else if (d > 0) {
                    System.out.println("D = " + d);
                    x1 = (-b + Math.sqrt(d)) / (2 * a);
                    x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println("x1 =  " + x1 + "  x2 = " + x2);
                } else if (d == 0) {
                    x1 = (-b) / (2 * a);
                    System.out.println("x = " + x1);
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR!");
            }
            break;
        }
    }
}
