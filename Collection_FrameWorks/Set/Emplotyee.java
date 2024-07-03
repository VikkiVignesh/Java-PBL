package Collection_FrameWorks.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.util.Iterator;

public class Emplotyee {
    public static void main(String[] args) {
        Set<String> Emp=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Employees");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            Emp.add(new String(sc.nextLine()));
        }

        Iterator it=Emp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
