import java.util.Scanner;

public class G_RCB_wins_again {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        int i = (n / 2) - 1, j = n / 2;
        while (i >= 0 && j < n) {
            System.out.print(arr[i] + " " + arr[j] + " ");
            i--;
            j++;
        }
        sc.close();
    }
}