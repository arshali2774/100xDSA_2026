import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) {
            sc.close();
            return;
        }
        long n = sc.nextLong();
        long copyOfN = n;
        long revNum = 0;
        if (n < 10) {
            System.out.println("YES");
            sc.close();
            return;
        }
        while (copyOfN > 0) {
            long remainder = copyOfN % 10;
            revNum = revNum * 10 + remainder;
            copyOfN = copyOfN / 10;
        }
        if (n == revNum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
