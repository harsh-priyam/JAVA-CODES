///////USING Access Modifiers//////////////


class Cylinder {

private int radius;
private int height;


public int getRadius(){
    return radius;
}

public void SetRadius(int radius){
    this.radius = radius;
}

public int getHeight(){
    return height;
}

public void SetHeight(int height){
    this.height = height;
}

public void CalcArea(){
    double area = 3.14*radius*height;
    System.out.println("The Area will be :"+area);
}

public void CalcVol(){
    double vol = 3.14*radius*radius*height;
    System.out.println("The Area will be :"+vol);
}


}

public class MainAMC {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
     obj.SetHeight(5);
     int h = obj.getHeight();
     System.out.println("The height is :"+h);

     obj.SetRadius(3);
     int r = obj.getRadius();
     System.out.println("The radius is :"+r);

    obj.CalcArea();
    obj.CalcVol();


    }   
}
