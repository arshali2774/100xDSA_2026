import java.util.Scanner;

public class B_Fastest_Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time[] = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
        }
        int minTime = time[0];
        int idOfFastestRunner = 0;
        for (int i = 0; i < n; i++) {
            if (time[i] <= minTime) {
                minTime = time[i];
                idOfFastestRunner = i + 1;
            }
        }
        System.out.println(idOfFastestRunner);
        sc.close();
    }
}