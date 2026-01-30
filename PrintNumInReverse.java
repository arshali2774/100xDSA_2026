import java.util.Scanner;

public class PrintNumInReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) {
            sc.close();
            return;
        }
        long n = sc.nextLong();
        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }
        while (n > 0) {
            long lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        sc.close();
    }
}