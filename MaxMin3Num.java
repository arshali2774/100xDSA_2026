
import java.util.Scanner;

public class MaxMin3Num {
  public static void main(String[] args) {
    int A,B,C;
    Scanner sc = new Scanner(System.in);
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();

    int x,y;
    if(A>=B && A>=C){
      y=A;
      if(B>=C){
        x=C;
      }else{
        x=B;
      }
    }else if(B>=A && B>=C){
      y=B;
      if(A>=C){
        x=C;
      }else{
        x=A;
      }
    }else{
      y=C;
      if(A>=B){
        x=B;
      }else{
        x=A;
      } 
    }
    System.out.println("Min = "+x);
    System.out.println("Max = "+y);
  }
}
