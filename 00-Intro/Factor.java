import java.util.Scanner;

public class Factor {
 public static void main(String[] args) {
    int N, F;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    F = sc.nextInt();
    if(N%F==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  } 
}
