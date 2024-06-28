package ThreadsConcept;

import java.util.Random;

class Threads implements Runnable
{
    public void run()
    {
        String colors[]={"White","Blue","Black","Green","Yellow","Red"};
        while(!colors[new Random().nextInt(0,colors.length-1)].equals("Green"))
        {
            System.out.println(colors[new Random().nextInt(0,colors.length-1)]);
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        Threads t1=new Threads();
        Threads t2=new Threads(); // Here we are not extending thread class ,so we shd pass instance of runnable interface to thread constructor
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);

        th1.start();
        th2.start();
    }
}
