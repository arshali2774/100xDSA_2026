import java.util.Scanner;

public class PrintPrimes1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        printPrime(n);
        sc.close();
    }

    private static void printPrime(int n) {
        if (n < 2) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(i);
            }
        }
        System.out.println(sb.toString());

    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
