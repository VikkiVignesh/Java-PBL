package Collection_FrameWorks.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArList {
 public static void main(String[] args) {
    ArrayList<String> months=new ArrayList<>();
    String mon[]={"January","Febrary","March","April","May","June","July","August","September","October","November","December"};
    months.addAll(Arrays.asList(mon));
    System.out.println(months);
 }   
}
