package ThreadsConcept;


class MultiThreads extends Thread
{
    public MultiThreads(String s)
    {
        super(s);
    }
    public void run()
    {
        System.out.println("Thread Name : "+getName());
    }
}
public class DemoThread {
    public static void main(String[] args) {
       Thread t1=new MultiThreads("Scooby");
       Thread t2=new MultiThreads("Shaggy");
       t1.start();
       t2.start();
    }

}
