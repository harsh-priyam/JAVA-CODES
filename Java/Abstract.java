abstract class PrimaryClass {
    void Intro(){
        System.out.println("My name is Harsh Priyam");
    }

    abstract void Greet();
    abstract void Curse();
}

 class SecondaryClass extends PrimaryClass {
     void Greet(){
     System.out.println("GoodMorning");
    }
    void Curse() {
        System.out.println("Go To Hell");
    }
}

abstract class TertiaryClass extends PrimaryClass {
    void SayJoke(){
        System.out.println("HA HA HA HA HA HA HA HA");
    }
}

class Abstract {
    public static void main(String[] args) {
     SecondaryClass sc = new SecondaryClass();
     sc.Curse();
     sc.Greet();
     sc.Intro();
    //  PrimaryClass pc  = new PrimaryClass();   --> Cannot
    //  TertiaryClass tc = new TertiaryClass() ; --> Cannot 
    }
}