
class Cylinder {

    int radius;
    int height;

 Cylinder(){
   radius = 3;
   height = 5;
 }   

 Cylinder(int radius , int height)
 {
    this.radius = radius;
    this.height = height;
 }

 public void CalcArea(){
     double area = 3.14*radius*height;
     System.out.println("The Area of the cylinder is :"+area);
 }

 public void CalcVol(){
    double vol = 3.14*radius*radius*height;
    System.out.println("The Volume of the cylinder is"+vol);
 }


}

public class MainCycCons {
    
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(5,10);
        obj.CalcArea();
        obj.CalcVol();
    }


}
