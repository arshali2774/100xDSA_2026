import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        // year%100 century rule check. If it is a century year, it must be divisible by 400 to be a leap year.
        if(year%100==0){
            if(year%400==0)
                System.out.println("Yes");
            else 
                System.out.println("No");
        }else if(year%4==0){ // if not a century year, check divisibility by 4
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}