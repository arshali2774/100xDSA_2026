import java.util.Scanner;

public class FindHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findHCF(a, b));
        sc.close();
    }

    private static int findHCF(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
