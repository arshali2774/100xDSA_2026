import java.util.Scanner;

public class CountGoodNumbers {
    public static void main(String[] args) {
        int N, x;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int goodIntegers = 0;
        for (int i = 0; i < N; i++) {
            x = sc.nextInt();
            if (x == 0) {
                ++goodIntegers;
                continue;
            }
            if (18 % x == 0 || x % 45 == 0) {
                ++goodIntegers;
            }
        }
        System.out.println(goodIntegers);

    }
}
