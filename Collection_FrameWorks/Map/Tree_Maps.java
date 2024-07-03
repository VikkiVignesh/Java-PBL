package Collection_FrameWorks.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class India {
    TreeMap<String, String> M1;

    public India() {
        M1 = new TreeMap<>();
    }

    TreeMap<String, String> saveCountryCapital(String cname, String capital) {
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

    TreeMap<String, String> swap_Map() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    ArrayList<String> getList() {
        ArrayList<String> lst = new ArrayList<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            lst.add(entry.getKey());
        }
        return lst;
    }

    void display() {
        System.out.println("State | Capital");
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            System.out.println(entry.getKey() + "  |  " + entry.getValue());
        }
    }
}

public class Tree_Maps {
    public static void display(TreeMap<String, String> M1) {
        System.out.println("State | Capital");
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            System.out.println(entry.getKey() + "  |  " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        India india = new India();
        india.saveCountryCapital("Karnataka", "Bengaluru");
        india.saveCountryCapital("Tamil Nadu", "Chennai");
        india.saveCountryCapital("Andhra Pradesh", "Hyderabad");
        india.saveCountryCapital("Punjab", "Chandigarh");
        india.saveCountryCapital("Jammu & Kashmir", "Srinagar");
        india.saveCountryCapital("India", "Delhi");

        ArrayList<String> res = india.getList();
        System.out.println(res);
        india.display();

        TreeMap<String, String> swapped = india.swap_Map();
        display(swapped);
        System.out.println(india.getCapital("India"));
    }
}