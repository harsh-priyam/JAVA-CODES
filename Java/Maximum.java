public class Maximum {
    public static void main(String[] args) {
      int []arr = {12,34,122,78,1};

     int max = arr[0];
     int min = arr[0];

      for (int i = 0; i < arr.length; i++) {
          if (max < arr[i]) {
              max = arr[i];
          }
          else if(min > arr[i])
          {
              min = arr[i];
          }
      }
      System.out.println("The maximum element inside the array is : "+max);
      System.out.println("The minimum element inside the array is : "+min);
    }
}
