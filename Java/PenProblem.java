


abstract class Pen {
    abstract public void write();
    abstract public void refill();
}

class FountainPen extends Pen {
    public void write(){
     System.out.println("Writing Smoothly");
    }
    public void refill(){
     System.out.println("Refilling Time");
    }
    public void changeNib(){
     System.out.println("Changing The Nib");
    }
}


 class PenProblem {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}
