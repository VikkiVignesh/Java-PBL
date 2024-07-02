package Collection_FrameWorks.List;

import java.util.ArrayList;


public class EmployeeDB {
    ArrayList<Employess> list=new ArrayList<>();

    boolean addEmployee(Employess e)
    {
         return list.add(e);
    }
    
    boolean deleteEmployee(int id)
    {
       for(Employess e: list)
       {
        if(e.empId==id)
        {
            return list.remove(e);
        }
       }
       return false;
    }

    String showpayslip(int id)
    {
        StringBuilder str=new StringBuilder();
        str.append("_________Salary Slip__________\n");
        for(Employess e:list)
        {
            if(e.empId==id)
            {
                str.append(e.name+"\n");
                str.append(e.salary);
            }
        }

       return str.toString();
    }

    public static void main(String[] args) {
        Employess e1= new Employess(1, "Vikki", "Vikki@gmail.com", "male", 45000);
        Employess e2=new Employess(2, "Vicky", "Vicky@gmail.com", "Male", 50000);
        EmployeeDB empDB=new EmployeeDB();
        System.out.println(empDB.addEmployee(e1));
        System.out.println(empDB.addEmployee(e2));
        System.out.println(empDB.list.size());
        System.out.println(empDB.deleteEmployee(1));
        System.out.println(empDB.list.size());
     e1.getEmployeeInfo();
     e2.getEmployeeInfo();
        System.out.println(empDB.showpayslip(2));
    }
}
