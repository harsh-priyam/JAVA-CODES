 class Circle{
    
    int radius = 5;

  public void Area(){
    double area = 3.14*radius*radius;
   System.out.println("The area will be :"+area); 
}  
 }

class Cylinder extends Circle {
    int height = 3;
   public void Volume(){
       double vol = 3.14*radius*radius*height;
       System.out.println("The Volume will be :"+vol);
    } 
} 


public class MainQue {
public static void main(String[] args) {
    Circle obj = new Circle();
    Cylinder obj1 = new Cylinder();

    obj.Area();
    obj1.Volume();
    
}
    
}