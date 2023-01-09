abstract class Telephone{
    abstract public void ring();
    abstract  public void lift();
    abstract public void disconnect();
}

class SmartPhone extends Telephone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void lift(){
        System.out.println("Lifting");
    }
    public void disconnect(){
        System.out.println("Disconnecting");
    }
    public void Smartfunctions(){
        System.out.println("using smart features");
    }
}


public class Phone {
public static void main(String[] args) {
    Telephone obj = new SmartPhone();
    obj.disconnect();
    // obj.Smartfunctions();
}    
}
