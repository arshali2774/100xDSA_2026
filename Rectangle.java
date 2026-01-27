import java.util.Scanner;
public class Rectangle {
 public static void main(String[] args) {
    int length, breadth;
    Scanner sc = new Scanner(System.in);
    length = sc.nextInt();
    breadth = sc.nextInt();
    int area = length * breadth;
    int perimeter = 2 * (length + breadth);
    System.out.println("Area = " + area);
    System.out.println("Perimeter = " + perimeter);
  } 
}
