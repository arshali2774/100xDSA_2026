import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) {
            sc.close();
            return;
        }
        long n = sc.nextLong();
        long sum = 0;
        while (n > 0) {
            long lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
