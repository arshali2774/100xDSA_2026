import java.util.Scanner;

public class ReverseNumStoreInVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) {
            sc.close();
            return;
        }
        long n = sc.nextLong();
        long copyOfN = n;
        long revNum = 0;
        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }
        while (copyOfN > 0) {
            long remainder = copyOfN % 10;
            revNum = revNum * 10 + remainder;
            copyOfN = copyOfN / 10;
        }
        System.out.println(revNum);
        sc.close();
    }
}
