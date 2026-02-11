import java.util.Scanner;

public class NCR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        int r = sc.nextInt();
        int factorialN = factorial(n);
        int factorialR = factorial(r);
        int factorialNR = factorial(n - r);
        System.out.println(factorialN / (factorialR * factorialNR));
        sc.close();
    }

    private static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        int result = 1;
        while (x > 0) {
            result *= x;
            x--;
        }
        return result;
    }
}
