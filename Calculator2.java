
import java.util.Scanner;
public class Calculator2 {
 public static void main(String[] args) {
    long N,M;
   Scanner sc = new Scanner(System.in);
   N = sc.nextLong();
   M = sc.nextLong();
   long sum = N+M;
   long diff = N-M;
   long pdt = N*M;
   long rem = N/M;
   long mod = N%M;
   System.out.println(N + " + " + M + " = " + sum);
   System.out.println(N + " - " + M + " = " + diff);
   System.out.println(N + " * " + M + " = " + pdt);
   System.out.println(N + " / " + M + " = " + rem);
   System.out.println(N + " % " + M + " = " + mod);
   
  } 
}
