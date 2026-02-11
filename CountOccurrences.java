import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
