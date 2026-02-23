import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
            }
            int count0 = 0, count1 = 0;
            for (int k = 0; k < n; k++) {
                if (arr[k] == 0)
                    count0++;
                else
                    count1++;
            }
            while (count0 > 0) {
                System.out.print(0 + " ");
                --count0;
            }
            while (count1 > 0) {
                System.out.print(1 + " ");
                --count1;
            }
            System.out.println();
        }

        sc.close();
    }
}
