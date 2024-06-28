package ThreadsConcept;

class controlThread extends Thread
{
    String name;
    Thread thread;
    controlThread(String n)
    {
        name=n;
        thread=new Thread(this,name);
        System.out.println("New Threa "+thread);
        thread.start();
    }

    public void run()
    {
        try {
            for(int i=5;i>0;i--)
            {
              System.out.println("Child Thread "+i);
              thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println(name+"Interrupted");
        }
        System.out.println(name+"Thread Exiting");
    }
}
public class ThreadControls {
    public static void main(String[] args) {
        controlThread t1=new controlThread("Word");
        controlThread t2=new controlThread("music");
        controlThread t3=new controlThread("browser");

        System.out.println(t1.thread.isAlive());
        System.out.println(t2.thread.isAlive());
        System.out.println(t3.thread.isAlive());

        try {
            System.out.println("Waiting for the Thread to Complete");
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Main thread Interrupted");
        }

        System.out.println(t1.thread.isAlive());
        System.out.println(t2.thread.isAlive());
        System.out.println(t3.thread.isAlive());
    }
}
