import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int N = sc.nextInt();
        StringBuilder output = new StringBuilder();

        // top half
        for (int i = 0; i < N; i++) {
            appendLine(output, i, (2 * i + 1));
        }
        // bottom half
        for (int i = N - 2; i >= 0; i--) {
            appendLine(output, i, (2 * i + 1));
        }
        System.out.print(output.toString());
        sc.close();
    }

    private static void appendLine(StringBuilder sb, int spaces, int arrows) {
        for (int i = 0; i < spaces; i++) {
            sb.append(" ");
        }
        for (int i = 0; i < arrows; i++) {
            if (i == 0 || i == arrows - 1) {
                sb.append(">");
            } else {
                sb.append(" ");
            }
        }
        sb.append("\n");
    }
}
