import java.util.Scanner;

public class IntersectionOfArrays {
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
        long arr1[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextLong();
        }
        int m = sc.nextInt();
        long arr2[] = new long[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextLong();
        }
        boolean used[] = new boolean[m];
        for (int i = 0; i < n; i++) {
            long ele = arr1[i];
            for (int j = 0; j < m; j++) {
                if (!used[j] && ele == arr2[j]) {
                    System.out.print(ele + " ");
                    used[j] = true;
                    break;
                }
            }
        }
    }
}
