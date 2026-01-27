import java.util.Scanner;

public class Multiple {
 public static void main(String[] args) {
    int N,M;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    if(M%N==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  } 
}
