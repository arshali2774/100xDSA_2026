import java.util.Scanner;

public class D_Compare_Factorials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if ((a == 0 && b == 1) || (a == 1 && b == 0) || (a == b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}