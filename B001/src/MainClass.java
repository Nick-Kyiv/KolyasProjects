import java.util.Scanner;

public class MainClass {

    int i = 1;

    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел для подсчета (>1).");
        Scanner scanner = new Scanner(System.in);
        long sum = 0, sumtpow = 0, b = scanner.nextLong(), tpow = 0, sumspow = 0;
        for (long i = b; i > 0; i--) {
            sum += i;
            tpow = i ^ 3;
            sumtpow += tpow;
            sumspow = sum ^ 2;
        }
        System.out.println("Сумма (путем сложения кубов чисел) =" + sumtpow);
        System.out.println("Сумма (квадрат суммы чисел) =" + sumspow);
        System.out.println("Введите кол-во чисел для подсчета от 2-ки (>2)");
        Scanner r = new Scanner(System.in);
        long sum2 = 0, sumtpow2 = 0, h = r.nextLong(), tpow2 = 0, sumspow2 = 0;
        for (long i = h; i > 1; i--) {
            sum2 += i;
            tpow2 = i ^ 3;
            sumtpow2 += tpow2;
            sumspow2 = sum2 ^ 2;
        }
        System.out.println("Сумма (путем сложения кубов чисел) =" + sumtpow2);
        System.out.println("Сумма (квадрат суммы чисел) =" + sumspow2);
    }
}