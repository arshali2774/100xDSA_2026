import java.util.Scanner;

public class ArrangeTheNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int num = 1;
            int i = 0, j = n - 1;
            while (i <= j) {
                if (i == j) {
                    arr[i] = num++;
                    break;
                }
                arr[i] = num++;
                arr[j] = num++;
                ++i;
                --j;
            }
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
            t--;
        }

        sc.close();
    }
}
