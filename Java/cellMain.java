class CellPhone {
  
    public void Vibration(){
        System.out.println("Cellphone is Vibrating");
    }

    public void Ringtone(){
        System.out.println("Cellphone is Ringing");
    }

    public void DoNotDisturb(){
        System.out.println("Cellphone is on silent");
    }

}



public class cellMain {
    
    public static void main(String[] args) {
        CellPhone obj = new CellPhone();
        obj.Vibration();
        obj.Ringtone();
        obj.DoNotDisturb();
    }

}
