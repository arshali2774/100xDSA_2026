import java.util.Scanner;

public class MaxEleAndPos {
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
        long maxEle = arr[0];
        int maxElePos = 0;
        for (int i = 0; i < n; i++) {
            if (maxEle < arr[i]) {
                maxEle = arr[i];
                maxElePos = i;
            }
        }
        maxElePos++;
        System.out.println(maxEle + " " + maxElePos);
        sc.close();
    }
}
