import java.util.Scanner;

public class IsVowel {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      char x = sc.next().charAt(0);
   if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
     System.out.println("YES");
   }else{
     System.out.println("NO");
   }
 }
}

