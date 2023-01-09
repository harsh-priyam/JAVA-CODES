
class ThreadPrior extends Thread {
    public ThreadPrior(String name){
        super(name);
    }

   public void run(){
    
    // int i = 34;
   while (true) {
       System.out.println("Thank You"+ this.getName());
   }
   }

}




public class ThreadPriority {
    public static void main(String[] args) {
        ThreadPrior t1 = new ThreadPrior("Harsh");
        ThreadPrior t2 = new ThreadPrior("Sahil");
        ThreadPrior t3 = new ThreadPrior("Saurav");
        ThreadPrior t4 = new ThreadPrior("Aman");
        ThreadPrior t5 = new ThreadPrior("Kunal (VIP)");

     t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
