import java.util.Scanner;

public class SearchEleInArray {
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
        boolean isEleFound = false;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                isEleFound = true;
                break;
            }
        }
        if (isEleFound) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
