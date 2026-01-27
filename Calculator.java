import java.util.Scanner;
public class Calculator {
 public static void main(String[] args) {
    int N,M;
   Scanner sc = new Scanner(System.in);
   N = sc.nextInt();
   M = sc.nextInt();
   int sum = N+M;
   int diff = N-M;
   int pdt = N*M;
   int rem = N/M;
   int mod = N%M;
   System.out.println(N + " + " + M + " = " + sum);
   System.out.println(N + " - " + M + " = " + diff);
   System.out.println(N + " * " + M + " = " + pdt);
   System.out.println(N + " / " + M + " = " + rem);
   System.out.println(N + " % " + M + " = " + mod);
   
  } 
}  
