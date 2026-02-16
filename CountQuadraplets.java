import java.util.Scanner;

public class CountQuadraplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        int value = a[i] - 2 * a[j] + 3 * a[k] - 4 * a[l];
                        if (value == x)
                            count++;
                    }
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}
