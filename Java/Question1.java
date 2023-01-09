import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int n = 10;

    Scanner sc   = new Scanner(System.in);
    System.out.println("Enter the value for the num:");
      int num = sc.nextInt();


        for (int i = 1; i <= n ; i++) {
            System.out.format("%d X %d = %d",num,i,num*i);
            System.out.println("\n");
        }
        sc.close();
    }
}
