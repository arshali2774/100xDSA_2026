import java.util.Scanner;

public class C_Sort_0_1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count0++;
            if (arr[i] == 1)
                count1++;
            if (arr[i] == 2)
                count2++;
        }
        while (count2 > 0) {
            System.out.print(2 + " ");
            count2--;
        }
        while (count1 > 0) {
            System.out.print(1 + " ");
            count1--;
        }
        while (count0 > 0) {
            System.out.print(0 + " ");
            count0--;
        }

        sc.close();
    }
}