package OopsConcept.Interfaces;

/**
 * InnerTest
 */
interface InnerTest {
final int a=100;
static void m1()
{
    System.out.println("Interface Static method called !!!");
}
void dispaly();
}
public class Test implements InnerTest {
    public static void main(String[] args) {
        InnerTest.m1();
        System.out.println(InnerTest.a);
       Test ts=new Test();
       ts.dispaly();

    }
    public void dispaly()
    {
        System.out.println("Called Display method");
    }
}
