package Wrappers;


class Test implements Cloneable
{
    int a,b;
    
    public Test(int x,int y)
    {
        a=x;
        b=y;
    }
    Test cloneTest()
    {
        try {
            return (Test) super.clone();
        } catch (CloneNotSupportedException e) {
           System.out.println(e);
        }
        return this;
    }
}
public class Clonables {
    public static void main(String[] args) {
        Test A1=new Test(10, 20);
        Test A2;
        //A2=A1;
        A2=A1.clon
        System.out.println(A1.a);
        System.out.println(A1.b);

        System.out.println(A2.a);
        System.out.println(A2.b);
    }
}
