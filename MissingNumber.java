import java.util.Scanner;

public class MissingNumber {
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
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i])
                    count++;
            }
            if (count == 1) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
