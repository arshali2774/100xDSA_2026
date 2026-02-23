import java.util.Scanner;

public class I_Unique_Elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        boolean isNoEleUnique = false;
        for (int i = 0; i < n; i++) {
            int countOfEle = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    countOfEle++;
            }
            if (countOfEle == 1) {
                System.out.print(arr[i] + " ");
                isNoEleUnique = false;
            } else {
                isNoEleUnique = true;
            }
        }
        if (isNoEleUnique) {
            System.out.println();
        }
        sc.close();
    }
}