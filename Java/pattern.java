import java.util.Scanner;

public class pattern {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();

    for (int i = 0; i < rows ; i++) {
        for (int j = 0; j < rows + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
  sc.close();
   }
    
}
