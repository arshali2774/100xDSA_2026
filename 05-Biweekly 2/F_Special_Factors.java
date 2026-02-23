import java.util.Scanner;

public class F_Special_Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hasSpecialFactors = false;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && (i % 10 == 2 || i % 10 == 7)) {
                System.out.print(i + " ");
                hasSpecialFactors = true;
            }
        }
        if (!hasSpecialFactors) {
            System.out.print(-1);
        }
    }
}