package Collection_FrameWorks.Generics;

class Test<T>  //declaration of Generic Class
{
    T obj;
    public Test(T i)  //cpmstructor to initialise object 
    {
        this.obj=i;
    }
}


//generic class with two types of objects
class Example<T,U>
{
    T obj1;
    U obj2;
    public Example(T a,U b)
    {
        obj1=a;
        obj2=b;
    }
}
public class FirstGenerics {
   
    public static void main(String[] args) {
        Test<Integer> t1=new Test(20);
        Test<String> s1=new Test("Vicky");
        System.out.println(t1.obj);
        System.out.println(s1.obj);
        System.out.println(t1.getClass());
        System.out.println(t1.getClass().getTypeName());
        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getTypeName());

        Example<String,Character> e1=new Example<>("Vicky", (char)65);
        Example<Double,Integer> e2=new Example(52.2364646, 452);
        System.out.println(e1.obj1);
        System.out.println(e1.obj2);

        System.out.println(e2.obj1);
        System.out.println(e2.obj2);
        
    }
}
