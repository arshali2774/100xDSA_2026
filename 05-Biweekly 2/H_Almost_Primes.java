import java.util.Scanner;

public class H_Almost_Primes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int countDivisor = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0)
                    countDivisor++;
            }
            if (countDivisor <= 4) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}