package OopsConcept.Polymorphism;

public class Fruits {
   String name,taste;
    int size;
    Fruits(String x,String y,int z)
    {
        this.name=x;
        this.taste=y;
        this.size=z;
    }
    void eat()
    {
        System.out.println("Eat Method from the fruit..");
    }

    public static void main(String[] args) {
        Fruits fruit; //creating references of Parent varible to invoke its child's methods
        Apple app=new Apple("Kashmir", "Sweet", 20);
        fruit=app;
        app.eat();
        fruit.eat();
        Orange org=new Orange("Malta", "Sweet Bitter", 30);
        fruit=org;
        org.eat();
        fruit.eat();
    }

}


class Apple extends Fruits
{
   Apple(String x,String y,int z)
   {
    super(x, y, z);
   }
   void eat()
   {
    System.out.println("Eat Apple");
   }
}

class Orange extends Fruits
{
   Orange(String x,String y,int z)
   {
    super(x,y,z);
   }
   void eat()
   {
    System.out.println("Eat Orange");
   }
}
