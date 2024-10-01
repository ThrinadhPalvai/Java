import java.util.Scanner;
class Employee
{
   String ename;
   int id;
   Employee()
   {
     id=0;
     ename="xxx";
   }
   Employee(int i,String nm)
   {
     id=i;
     ename=nm;
   }
  
    public void display()
    {
      System.out.println("Employee name:"+ename);
      System.out.println("Employee Id:"+ id);
    }
}
public class EmployeeData
{
  public static void main(String args[])
  {
    System.out.println("The Employee details are:");
    Employee e1=new Employee(1," Sunmathi");
    Employee e2=new Employee(2," Jessy");
    Employee e3=new Employee(3," Radhika");
    e1.display();
    e2.display();
    e3.display();
   
  }
}