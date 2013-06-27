import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел для подсчета (>1).");
        Scanner scanner = new Scanner(System.in);
        long sum = 0, sumtpow = 0, b = scanner.nextLong(), tpow = 0, sumspow = 0;
        for (long i = b; i > 0; i--) {
            sum += i;
            tpow = i * i * i;
            sumtpow += tpow;
            sumspow = sum * sum;
        }
        System.out.println("Сумма (путем сложения кубов чисел) =" + sumtpow);
        System.out.println("Сумма (квадрат суммы чисел) =" + sumspow);
        System.out.println("Введите кол-во чисел для подсчета от 2-ки (>2)");
        Scanner r = new Scanner(System.in);
        long ssum = 0, sumtspow = 0, h = r.nextLong(), stpow = 0, sumsspow = 0;
        for (long i = h; i > 1; i--) {
            ssum += i;
            stpow = i * i * i;
            sumtspow += stpow;
            sumsspow = ssum * ssum;
        }
        System.out.println("Сумма (путем сложения кубов чисел) =" + sumtspow);
        System.out.println("Сумма (квадрат суммы чисел) =" + sumsspow);

    }
}
