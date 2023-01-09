import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int [5];
         int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element: "+i);
             arr[i] = sc.nextInt(); 
        }
        
        System.out.println("Now we are the adding all the elements");

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("The Sum for the array will be : "+sum);


        sc.close();
    }
    
}
