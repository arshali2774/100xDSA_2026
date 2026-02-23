import java.util.Scanner;

public class AddLastDigits {
  public static void main(String[] args) {
     int N,M;
     Scanner sc = new Scanner(System.in);
     N = sc.nextInt();
     M = sc.nextInt();
     int lastDigitN = N%10;
     int lastDigitM = M%10;
     int lastDigitSum = lastDigitN + lastDigitM;
     System.out.println(lastDigitSum);
   } 
}
