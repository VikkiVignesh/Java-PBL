package OopsConcept.Abstraction;

import java.util.Random;

abstract class Compartment{
    public abstract String notice();
}

class FirstClass extends Compartment
{
    public String notice()
    {
        return "Message from FirstClass Compartment";
    }
}

class Ladies extends Compartment
{
    public String notice()
    {
        return "Message from Ladies Compartment";
    }
}

class General extends Compartment
{
    public String notice()
    {
        return "Message from General Compartment";
    }
}

class Luggages extends Compartment
{
    public String notice()
    {
        return "Message from luggages Compartment";
    }
}
public class RailwayCompartment {
    
    public static void main(String [] args)
    {
        Random r=new Random();
        Compartment coaches[]=new Compartment[10];
        for(int i=0;i<coaches.length;i++)
        { 
            switch(r.nextInt(10))
            {
                case 0:
                    coaches[i]=new Luggages();
                    break;
                case 1:
                    coaches[i]=new FirstClass();
                    break;
                case 2:
                    coaches[i]=new General();
                    break;
                case 3:
                    coaches[i]=new Ladies();
                    break;
            }
        }
    for(int i=0;i<coaches.length;i++)
    {
        coaches[i].notice();
    }
    }
}
