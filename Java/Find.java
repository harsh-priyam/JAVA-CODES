import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
       
        int []arr = {1,2,3,4,5};
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value you want to  search :");
       int num = sc.nextInt();     
     int i = 0;
        while (i < arr.length) {
            if (arr[i] == num) {
                System.out.println("Found at "+i);
                break;
            }

            else {
                i++;
            }
        }
     sc.close();       
    }
}
