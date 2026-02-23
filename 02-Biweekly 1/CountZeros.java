import java.util.Scanner;

public class CountZeros {

    public static void main(String[] args) {
        long N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        if (N == 0) {
            System.out.println(1);
            return;
        }
        long copyOfN = N;
        int zeroCounter = 0;
        while (copyOfN > 0) {
            long remainder = copyOfN % 10;
            if (remainder == 0) {
                ++zeroCounter;
            }
            copyOfN = copyOfN / 10;
        }
        System.out.println(zeroCounter);
    }
}