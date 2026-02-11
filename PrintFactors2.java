import java.util.Scanner;

public class PrintFactors2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        printFactorsRevers(n);
        sc.close();
    }

    private static void printFactorsRevers(int n) {
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
