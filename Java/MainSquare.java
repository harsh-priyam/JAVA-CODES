class Square{
    public void CalcArea(int l){
        int area = l*l;
       System.out.println("The area of the square will be:" +area);
    }

    public void CalcPerimeter(int l){
        int peri = 4*l;
       System.out.println("The perimeter of the square will be:" +peri);
    }
}


public class MainSquare {
    
 public static void main(String[] args) {
    Square obj = new Square();
    obj.CalcArea(5);
    obj.CalcPerimeter(5);
 }

}
