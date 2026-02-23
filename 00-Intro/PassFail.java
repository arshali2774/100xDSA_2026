import java.util.Scanner;

public class PassFail {
 public static void main(String[] args) {
    int marks;
    Scanner sc = new Scanner(System.in);
    marks = sc.nextInt();
    if(marks>=35){ // atleast means greater than or equal to
      System.out.println("Pass");
    }else{
      System.out.println("Fail");
    }
  } 
}
