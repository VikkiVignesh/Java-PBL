package Collection_FrameWorks.List;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

import java.util.Iterator;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.addAll(Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"));
        System.out.println(v);

        System.out.println("Printing Elements Using Enumerations");
        Enumeration<String> enm=v.elements();
        while (enm.hasMoreElements()) {
            System.out.println(enm.nextElement());
        }

        System.out.println("Printing elements using Iterators ");
        Iterator<String> it=v.iterator();
        while (it.hasNext()) {
          System.out.println(it.next());   
        }
    }
}
