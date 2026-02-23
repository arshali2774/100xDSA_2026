import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i)
                    output.append("*");
                else
                    output.append(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j >= n - i - 1)
                    output.append("*");
                else
                    output.append(" ");
            }
            output.append("\n");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i)
                    output.append("*");
                else
                    output.append(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j > i)
                    output.append("*");
                else
                    output.append(" ");
            }
            output.append("\n");
        }
        System.out.println(output.toString());
        sc.close();
    }
}
