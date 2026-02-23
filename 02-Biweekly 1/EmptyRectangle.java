import java.util.Scanner;

public class EmptyRectangle {
    public static void main(String[] args) {
        int N, M;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if ((i == 0 || j == 0) || (i == N - 1 || j == M - 1))
                        System.out.print("^");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
