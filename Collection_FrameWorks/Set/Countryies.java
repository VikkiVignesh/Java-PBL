package Collection_FrameWorks.Set;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;
import java.util.Scanner;

public class Countryies {
    Set<String> contry;

    Countryies()
    {
        contry=new HashSet<>();
    }

    boolean addCountry(String str)
    {
        return contry.add(str);
    }

    boolean checkCountry(String name)
    {
        Iterator it=contry.iterator();
        while(it.hasNext())
        {
            if(it.next().equals(name))
              return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Countryies country=new Countryies();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Country ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            country.addCountry(sc.nextLine());
        }

        System.out.println("Enter the county name to serach");
        String str=sc.nextLine();

        if(country.checkCountry(str))
        {
            System.out.println(str+" is Present in the HashSet");
        }
        else
        {
            System.out.println(str+" not present in hashSet");
        }
    }
}
