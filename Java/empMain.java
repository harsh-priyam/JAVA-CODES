 class Employee {

   int salary;
   String name;
 
public String GetName() {
   return name; 
 }

public int GetSalary() {
    return salary;
 }

public void SetName(String n){
   name = n;
} 


}                                
    
public class empMain {
        public static void main(String[] args) {
             Employee obj1 = new Employee();
               
             obj1.SetName("Harsh Priyam");
             obj1.salary = 10000000;

             System.out.println(obj1.GetName());
             System.out.println(obj1.GetSalary());
    

        }
    }
    
