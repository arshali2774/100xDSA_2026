import java.util.Scanner;

public class MaxMin2Num {
  public static void main(String[] args) {
    int A,B;
    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    int x,y;
    if(A>=B){
      x=B;
      y=A;
    }else{
      x=A;
      y=B;
    }
    System.out.println("Min = "+x);
    System.out.println("Max = "+y);
  }
}
