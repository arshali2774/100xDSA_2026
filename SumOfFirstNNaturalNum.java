import java.util.Scanner;

public class SumOfFirstNNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        long sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
        sc.close();
    }
}
