import java.util.Scanner;

public class ShiftedPyramid {
    public static void main(String[] args) {
        int N;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    if (j <= (2 * i - 1) - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("x");
                    }
                }
                System.out.println();
            }
        }
    }
}
