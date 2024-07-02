package Collection_FrameWorks.List;

public class Employess {
    int empId;
    String name;
    String email;
    String gender;
    float salary;

    Employess(int x,String m,String n,String o,float z)
    {
        empId=x;
        name=m;
        email=n;
        gender=o;
        salary=z;
    }

    void getEmployeeInfo()
    {
        System.err.println("Displaying "+this.name+" Details");
        System.out.println("EmpId : "+empId);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Gender : "+gender);
        System.out.println("Salary : "+salary);
    }

}

