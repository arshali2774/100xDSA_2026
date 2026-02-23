import java.util.Scanner;

public class hello_functions {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        n = sc.nextInt();
        printHello(n);
        sc.close();
    }

    private static void printHello(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("I am learning functions");
        }
    }
}
