package OopsConcept.Inheritance;

public class Animal {
    public void eat()
    {
        System.out.println("Animal Eat");
    }
    public void sleep()
    {
        System.out.println("Animal Sleeping");
    }
    public static void main(String[] args) {
        Bird parrot=new Bird();
        Animal anim=new Animal();
        anim.eat();
        anim.sleep();

        parrot.fly();
        parrot.sleep();
    }
}

class Bird extends Animal
{
    public void fly()
    {
        System.out.println("Brid Flew");
    }
}
