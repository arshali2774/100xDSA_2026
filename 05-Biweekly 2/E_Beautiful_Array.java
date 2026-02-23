import java.util.Scanner;

public class E_Beautiful_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        boolean isArrBeautiful = true;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] != arr[i]) {
                isArrBeautiful = false;
                break;
            }
        }
        if (isArrBeautiful) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}