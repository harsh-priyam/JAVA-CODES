public class Varargs {

    static int sum(int ...arr)
    {
        int result = 0;
        for(int element:arr){
            result = result + element;
        }
        return result;
    }
   public static void main(String[] args) {
         System.out.println("The sum of 4 & 5 will be:" + sum(4,5));    
   }    
}
