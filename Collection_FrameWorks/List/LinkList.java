package Collection_FrameWorks.List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkList {
    public static void main(String[] args) {
        List<String> lst=new LinkedList<>();
        lst.addAll(Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"));
        ListIterator lit=lst.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
    }
}
