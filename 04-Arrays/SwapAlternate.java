import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            solve(sc);
            System.out.println();
            t--;
        }
        sc.close();
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        for (int i = 1; i < n; i += 2) {
            long temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
