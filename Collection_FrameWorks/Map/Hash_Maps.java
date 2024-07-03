package Collection_FrameWorks.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class India
{
    HashMap<String,String> M1;
    public India()
    {
        M1=new HashMap<>();
    }
    
    HashMap<String,String> saveCountryCapital(String cname, String capital)
    {
        M1.put(cname, capital);
        return M1;
    }

    String getCapital(String s)
    {
        return M1.get(s);
    }
    String getCountry(String c)
    {
        for(Map.Entry<String,String> entry:M1.entrySet())
        {
            if(entry.getValue().equals(c))
            {
                return entry.getKey();
            }
        }
        return null;
    }


    HashMap<String,String> swap_Map()
    {
        HashMap<String,String> M2=new HashMap<>();
        for(Map.Entry<String,String> entry:M1.entrySet())
        {
           M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    ArrayList<String> getList()
    {
        List<String> lst=new ArrayList<>();
        for(Map.Entry<String,String> entry:M1.entrySet())
        {
            lst.add(entry.getKey());
        }
        return (ArrayList<String>) lst;
    }

    void display()
    {
        System.out.println("State | Capital");
        for(Map.Entry<String,String> entry:M1.entrySet())
        {
            System.out.println(entry.getKey()+"  |  "+entry.getValue() );
        }
       
    }

}

public class Hash_Maps {
    public static void display(HashMap<String,String> M1)
    {
        System.out.println("State | Capital");
        for(Map.Entry<String,String> entry:M1.entrySet())
        {
            System.out.println(entry.getKey()+"  |  "+entry.getValue() );
        }
       
    }
    public static void main(String[] args) {
        India india=new India();
        india.saveCountryCapital("Karanataka", "Bengaluru");
        india.saveCountryCapital("Tamil Nadu", "Chennai");
        india.saveCountryCapital("Andhra pradesh", "Hyderabad");
        india.saveCountryCapital("Punjab", "Chattisgarh");
        india.saveCountryCapital("Jammu & kashmir ", "Srinagar");
        india.saveCountryCapital("India", "Delhi");

        ArrayList<String> res=india.getList();
        System.out.println(res);
        india.display();

        HashMap<String,String> swapped=india.swap_Map();
        display(swapped);
        System.out.println(india.getCapital("India"));

    }
}
