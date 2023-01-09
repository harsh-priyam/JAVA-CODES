public class Array {
    public static void main(String[] args) {
     
    //  ~~~~~~~~~~~~~~~Method -1~~~~~~~~~~~~~~~~~~~~~~   
        // int []marks = new int [5];
        //   marks[0] = 12;
        //   marks[1] = 122;
        //   marks[2] = 121;
        //   marks[3] = 1223;
        //   marks[4] = 125;        
        // System.out.println(marks[2]);

    // ~~~~~~~~~~~~~~~~~~~Method-2~~~~~~~~~~~~~~~~~~~~~~`
        // int []marks = {11,22,33,44,55};
        // System.out.println(marks[2]);

    int []marks = {20,40,80,89,44};

    // for (int i = 0; i < marks.length; i++) {
    //     System.out.println(marks[i]);
    // }

     for(int element:marks){
         System.out.println(element);
     } 


    }
}
