import java.util.Scanner;

public class FindLocationPoint {
 public static void main(String[] args) {
    int X,Y;
    Scanner sc = new Scanner(System.in);
    X = sc.nextInt();
    Y = sc.nextInt();
    if(X==0 && Y==0){
      System.out.println("Origin");
    }else if(X==0 && Y!=0){
      System.out.println("Y axis");
    }else if(X!=0 && Y==0){
      System.out.println("X axis");
    }else if(X>0 && Y>0){
      System.out.println("1st Quadrant");
    }else if(X<0 && Y>0){
      System.out.println("2nd Quadrant");
    }else if(X<0 && Y<0){
      System.out.println("3rd Quadrant");
    }else if(X>0 && Y<0){
      System.out.println("4th Quadrant");
    }
  } 
}
