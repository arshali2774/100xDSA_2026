import java.util.Scanner;

public class PrintEvenNum1toN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        sc.close();
    }

}
