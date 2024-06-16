package OopsConcept.Interfaces;

interface A{
 void run();
}
interface B extends A{
   void jump();
}
interface C extends B{
 public void stop();
}
public class Inheritance implements C {
  public void run()
  {
    System.out.println("Running");
  }
  public void jump()
  {
    System.out.println("Jumping");
  }

  public void stop()
  {
    System.out.println("Stopped");
}
    public static void main(String[] args) {
        C c=new Inheritance();
        c.jump();
        c.stop();
        c.run();
    }
}
