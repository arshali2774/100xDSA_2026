import java.util.Scanner;

public class HourGlassOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return;
        int N = sc.nextInt();
        // using string builder to build the whole line instead of using sysout. string
        // builder is faster for large outputs
        StringBuilder output = new StringBuilder();
        // 0 -> 5 dots
        // 1 -> 4 dots
        // 2 -> 3 dots
        // 3 -> 2 dots
        // 4 -> 1 dot
        // top half (rows 0 to n-1)
        for (int i = 0; i < N; i++) {
            // building eachline i=leading spaces and N-i are number of dots to print in
            // that row.
            appendLine(output, i, N - i);
        }
        // 3 -> 2 dots
        // 2 -> 3 dots
        // 1 -> 4 dots
        // 0 -> 5 dots
        // bottom half (rows n-2 down to 0)
        for (int i = N - 2; i >= 0; i--) {
            appendLine(output, i, N - i);
        }
        System.out.print(output.toString());
        sc.close();
    }

    private static void appendLine(StringBuilder sb, int space, int dots) {
        // leading space
        for (int i = 0; i < space; i++) {
            sb.append(" ");
        }
        // add dots after leading spaces with space between them and no trailing space
        for (int i = 0; i < dots; i++) {
            sb.append(".");
            if (i < dots - 1) {
                sb.append(" ");
            }
        }
        // move to next line
        sb.append("\n");
    }
}
