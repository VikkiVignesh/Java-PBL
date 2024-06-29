package ExceptionHandling;

import java.util.Scanner;

class Scorecard extends Exception
{
   int arr[];
   public Scorecard(int size,Scanner sc) throws NumberFormatException
   {
    arr=new int[size];
        for(int i=0;i<size;i++)
        {
            this.arr[i]=sc.nextInt();
        }
    
   }

   public void calculateavg()
   {
    try {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
         sum+=arr[i];
        }
        System.out.println("Students Average marks "+sum/arr.length);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
   }
}
public class MarksCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scorecard std1=new Scorecard(3, sc);
        Scorecard std2=new Scorecard(3, sc);

    
       std1.calculateavg();
       std2.calculateavg();
    }
}
