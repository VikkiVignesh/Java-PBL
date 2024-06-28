package ThreadsConcept;

class Account
{
    int balance;
    public  Account()
    {
        balance=5000;
    }
    public synchronized void withdraw(int bal)
    {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception Occured "+ e);
        }
        balance=balance-bal;
        System.out.println("Current Balance is :: "+balance);
    }
}

class C implements Runnable
{
    Account obj;
    public C(Account a)
    {
        obj=a;
    }
    public void run()
    {
        obj.withdraw(500);
    }
    
}
public class Synchronization {
    public static void main(String[] args) {
        Account acc=new Account();
        Thread c1=new Thread(new C(acc));
        Thread c2=new Thread(new C(acc));

        c1.run();
        c2.run();
    }
}
