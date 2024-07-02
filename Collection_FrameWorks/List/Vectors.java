package Collection_FrameWorks.List;

import java.util.Arrays;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.addAll(Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"));
        System.out.println(v);
    }
}
