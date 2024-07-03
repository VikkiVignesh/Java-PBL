package Collection_FrameWorks.Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

class India {
    Hashtable<String, String> M1;

    public India() {
        M1 = new Hashtable<>();
    }

    Hashtable<String, String> saveCountryCapital(String cname, String capital) {
        M1.put(cname, capital);
        return M1;
    }

    String getCapital(String s) {
        return M1.get(s);
    }

    String getCountry(String c) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(c)) {
                return entry.getKey();
            }
        }
        return null;
    }

    Hashtable<String, String> swap_Map() {
        Hashtable<String, String> M2 = new Hashtable<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    ArrayList<String> getList() {
        List<String> lst = new ArrayList<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            lst.add(entry.getKey());
        }
        return (ArrayList<String>) lst;
    }

    void display() {
        System.out.println("State | Capital");
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            System.out.println(entry.getKey() + "  |  " + entry.getValue());
        }
    }
}

public class Hash_Tables {
    public static void display(Hashtable<String, String> M1) {
        System.out.println("State | Capital");
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            System.out.println(entry.getKey() + "  |  " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        India india = new India();
        india.saveCountryCapital("Karanataka", "Bengaluru");
        india.saveCountryCapital("Tamil Nadu", "Chennai");
        india.saveCountryCapital("Andhra pradesh", "Hyderabad");
        india.saveCountryCapital("Punjab", "Chandigarh");
        india.saveCountryCapital("Jammu & Kashmir", "Srinagar");
        india.saveCountryCapital("India", "Delhi");

        ArrayList<String> res = india.getList();
        System.out.println(res);
        india.display();

        Hashtable<String, String> swapped = india.swap_Map();
        display(swapped);
        System.out.println(india.getCapital("India"));
    }
}

