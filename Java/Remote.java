interface TvRemote {
 public void Change();
 public void Volume();
}

interface SmartRemote extends TvRemote {
    public void Voice();
    public void Joystick();
}

class Television implements SmartRemote{
     public void Change(){
        System.out.println("Channel Changed Successfully");
     }
     public void Volume(){
        System.out.println("Volume Changed Successfully");
     }
     public void Voice(){
        System.out.println("Voice Command given successfully");
     }
     public void Joystick(){
        System.out.println("Scrolled Successfully");
     }
} 



public class Remote {
public static void main(String[] args) {
    Television telv = new Television();
    telv.Change();
    telv.Volume();
    telv.Voice();
    telv.Joystick();
}    
}
