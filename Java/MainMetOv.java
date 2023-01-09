class Father{
    public void MyMethod(){
        System.out.println("I am the default of Father Class");
    }

    public void MyMethod2(){
        System.out.println("I am the method 2 of Father Class");
    }

}

class Son extends Father {
    public void MyMethod(){
        System.out.println("I am the default of Son Class");
    }

    public void MyMethod2(){
        System.out.println("I am the method 2 of Son Class");
    }

    public void MyMethod3(){
        System.out.println("I am the method 3 of Son Class");
    }
}


public class MainMetOv {
public static void main(String[] args) {
    Father obj = new Father();
    obj.MyMethod2();

    Son obj1 = new Son();
    obj1.MyMethod2();
}    
}
