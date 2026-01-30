import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        int countPositive = 0;
        int countNegative = 0;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m == 0) {
                ++countEven;
            }
            if (m < 0) {
                if (m % 2 == 0) {
                    ++countEven;
                } else {
                    ++countOdd;
                }
                ++countNegative;
            } else if (m > 0) {
                if (m % 2 == 0) {
                    ++countEven;
                } else {
                    ++countOdd;
                }
                ++countPositive;
            }
        }
        System.out.println(countPositive);
        System.out.println(countNegative);
        System.out.println(countEven);
        System.out.println(countOdd);

        sc.close();
    }
}
