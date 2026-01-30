import java.util.Scanner;

public class Diamond {
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
            for (int j = 0; j <= i; j++) {
                output.append("*");
                if (j < i)
                    output.append(" ");
            }
            output.append("\n");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                output.append(" ");
            }
            for (int j = n - i - 1; j > 0; j--) {
                output.append("*");
                if (j < n)
                    output.append(" ");
            }
            output.append("\n");
        }
        System.out.println(output.toString());
        sc.close();
    }
}
