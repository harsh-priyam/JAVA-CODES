class ThreadMeth1 extends Thread {
   public void run(){
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class ThreadMeth2 extends Thread {
    public void run(){
         while (true) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
            
             System.out.println("Welcome");
         }
     }
 }
 






public class threadQue1 {
    public static void main(String[] args) {
        ThreadMeth1 t1 = new ThreadMeth1();
        ThreadMeth2 t2 = new ThreadMeth2();
        t1.setPriority(6);
        t2.setPriority(9);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // t1.start();
        // t2.start();
    }
}
