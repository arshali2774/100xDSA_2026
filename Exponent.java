import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int x = sc.nextInt();
        int n = sc.nextInt();
        long result = 1;
        if (n == 0) {
            System.out.println(result);
            sc.close();
            return;
        }
        while (n > 0) {
            result = result * x;
            n--;
        }
        System.out.println(result);
        sc.close();
    }
}
