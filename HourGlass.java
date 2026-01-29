import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        int N;
        // getting TLE on current logic, written by me.
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            for (int i = 1; i <= (2 * N - 1); i++) {
                if (i <= N) {
                    for (int j = 1; j <= (2 * N - i); j++) {
                        if ((2 * N - i) % 2 == 0) {
                            if (j % 2 == 0 && j >= i)
                                System.out.print(".");
                            else
                                System.out.print(" ");
                        } else {
                            if (j % 2 != 0 && j >= i)
                                System.out.print(".");
                            else
                                System.out.print(" ");
                        }
                    }
                } else {
                    for (int j = 1; j <= i; j++) {
                        if (i % 2 == 0) {
                            if (j % 2 == 0 && j >= (2 * N - i))
                                System.out.print(".");
                            else
                                System.out.print(" ");
                        } else {
                            if (j % 2 != 0 && j >= (2 * N - i))
                                System.out.print(".");
                            else
                                System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
