
interface PrimaryInterFace {
    void Method_1();
    void Method_2();
}

interface SecondaryInterface extends PrimaryInterFace {
    void Method_3();
    void Method_4();

}

class PrimaryClass implements SecondaryInterface {

   public void Method_1(){
        System.out.println("I am Method-1");
    }

   public void Method_2(){
        System.out.println("I am Method-2");
    }

  public  void Method_3(){
        System.out.println("I am Method-3");
    }
  public  void Method_4(){
        System.out.println("I am Method-4");
    }
}






public class InheritAbstract {
  public static void main(String[] args) {
    PrimaryClass pc = new PrimaryClass();
    pc.Method_1();
    pc.Method_2();
    pc.Method_3();
    pc.Method_4();
  }    
}
