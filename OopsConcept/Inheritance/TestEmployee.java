package OopsConcept.Inheritance;

class Employee extends Person
{
double salary;
String Insurance;
String yoj;
    Employee(String x, int y, String z,double s,String insu,String year) {
        super(x, y, z);
        this.salary=s;
        this.Insurance=insu;
        this.yoj=year;
    }

    void display()
    {
        System.out.println("Employee Details");
        System.out.println("Name : "+super.name);
        System.out.println("Age : "+super.age);
        System.out.println("Gneder : "+super.gender);
        System.out.println("Salary : "+salary);
        System.out.println("Insurance No> : "+Insurance);
        System.out.println("Year of Join : "+yoj);
    }
    
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee emp=new Employee("Vicky", 20, "Male", 80000, "YJY678SEsw", "Dec 2024");
        emp.display();
    }
}
