package OopsConcept.Inheritance;

public class Person {
    String name;
    int age;
    String gender;
    public Person(String x,int y,String z)
    {
        this.name=x;
        this.age=y;
        this.gender=z;
    }
    void setname(String s)
    {
        this.name=s;
    }
    String getname()
    {
        return this.name;
    }

    void setage(int s)
    {
        this.age=s;
    }
    int getage()
    {
        return this.age;
    }


    void setgender(String s)
    {
        this.gender=s;
    }
    String getgender()
    {
        return this.gender;
    }
}
