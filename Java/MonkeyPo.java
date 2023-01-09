interface BasicAnimal {
    public void eat();
    public void sleep();
 }
 
 class Monkey {
     void jump(){
       System.out.println("Jumping");
     }
 
     void bite(){
         System.out.println("Biting");
     }
 }
 
 class Human extends Monkey implements BasicAnimal {
    public void eat(){
     System.out.println("Eating");
    }
    public void sleep(){
    System.out.println("Sleeping");
    }
    
 }
 
 
 public class MonkeyPo{
     public static void main(String[] args) {
     Monkey mon = new Human();
    //  mon.sleep(); --> throws error
    mon.bite();  
     }
 }
 