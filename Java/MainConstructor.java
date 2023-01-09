class Student{

    int id;
    int marks;
    String name;

    Student(){ // UnParameterised Constructor
      id = 007;
      marks = 89;
      name = "Harsh Priyam";        
    }

    Student(int Myid , int Mymarks , String Myname) //Parameterised Constructor
    {
        id = Myid;
        marks = Mymarks;
        name = Myname;
    }


  void GetData(){
    System.out.println("My name is: "+name);
    System.out.println("I have got :"+marks);
    System.out.println("My University id is :"+id);
  }


}


public class MainConstructor {
    public static void main(String[] args) {
        Student obj = new Student(001,99,"Sujita Kumari");
        obj.GetData();
        
    }
}
