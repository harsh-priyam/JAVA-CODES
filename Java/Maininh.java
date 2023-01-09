// INHERITANCE IN JAVA PROGRAMMING 

class GrandFather {
    GrandFather(){
        System.out.println("I am the default Constructor of Base Class");
    }

    GrandFather(int x ){
        System.out.println("I am parameterised constructor of Base Class");
    }
}

class Father extends GrandFather 
{
    Father(){
        System.out.println("I am the default constructor of Father Class");
    }

    Father(int x , int y)
    {
        super(x);
        System.out.println("I am the parameterised constructor of Father Class");
    }
}

class Son extends Father {
    Son(){
        System.out.println("I am the default constructor of Son Class");
    }

    Son(int x , int y , int z)
    {
        super(x,y);
        System.out.println("I am the parameterised constructor of Son Class");
    }

}



public class Maininh {
   public static void main(String[] args) {
    Son obj = new Son();
    
   }    
}
