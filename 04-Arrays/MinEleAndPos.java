import java.util.Scanner;

public class MinEleAndPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long minEle = arr[0];
        int minElePos = 0;
        for (int i = 0; i < n; i++) {
            if (minEle > arr[i]) {
                minEle = arr[i];
                minElePos = i;
            }
        }
        minElePos++;
        System.out.println(minEle + " " + minElePos);
        sc.close();
    }
}
