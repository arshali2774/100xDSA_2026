import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        long factorial = 1;
        if (n == 0) {
            System.out.println(factorial);
            sc.close();
            return;
        }
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
        sc.close();
    }
}
