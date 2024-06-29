package ExceptionHandling;

import java.io.IOException;

class plane
{
    public plane() throws IOException,RuntimeException
    {
        System.out.println("Plane");
    }
}
class Jet extends plane
{
  public Jet() throws IOException
  {
     super();
  }
}
public class Example {
    public static void main(String[] args) {
      try {
        new plane();
      } catch (Exception e) {
       e.printStackTrace();  
      }
    }
}


//If any parent class is handling any exceptions then its child classes must handle the same else it will cause compiler error