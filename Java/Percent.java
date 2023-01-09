import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
      
      System.out.println("Enter the marks for Physics");
      int a = s.nextInt();
      
      System.out.println("Enter the marks for Mathematics");
      int b = s.nextInt();
      
      System.out.println("Enter the marks for Chemistry ");
      int c = s.nextInt();
      
      System.out.println("Enter the marks for English");
      int d = s.nextInt();
      
      System.out.println("Enter the marks for PHE");
      int e = s.nextInt();

      int sum = a + b + c + d + e;
      float pr = sum/5;

      System.out.println("The Percentage will be :" +pr);
      s.close();
  }      
}
