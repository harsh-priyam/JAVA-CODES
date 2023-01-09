class Phone{
    public void Greet(){
        System.out.println("Hello User This is your Phone!");
    }

    public void Start(){
        System.out.println("Phone is starting....!");
    }
}

class SmartPhone extends Phone{
    public void Cheers(){
        System.out.println("Hello user ! You can do it!! No Matter what !!");
    }
    
    public void Start(){
        System.out.println("Smart Phone is starting...!");
    }

}

public class MainDMD {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.Start();
        // it will call SmartPhone's Start!!!!!!!!!!!!
    }
}
