import java.util.Scanner;

public class TwoStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("**");
        }
        sc.close();
    }
}
