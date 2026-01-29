import java.util.Scanner;
public class SecondLastDigit {
 public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int answer=0;
    int quotient = n;
    for(int i=1;i<=2;i++){
      int remainder = quotient % 10;
      answer = remainder;
      quotient = quotient/10;
    }

    System.out.println(answer);
  } 
}
