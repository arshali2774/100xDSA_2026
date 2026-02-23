import java.util.Scanner;

public class TriangleCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                output.append(" ");
            }
            for (int j = i; j >= 0; j--) {
                output.append("*");
                if (j > 0) {
                    output.append(" ");
                }
            }
            output.append("\n");
        }
        System.out.println(output);
        sc.close();
    }
}
