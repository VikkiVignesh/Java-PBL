package Collection_FrameWorks.Set;

import java.util.Scanner;
import java.util.TreeSet;

import java.util.Iterator;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> tset=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Item");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            tset.add(new String(sc.nextLine()));
        }
       display(tset);
      
       reverse(tset);
    }

    public static void display(TreeSet<String>s)
    {
        Iterator it=s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public static void reverse(TreeSet<String>s) {
        Iterator it=s.descendingSet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
