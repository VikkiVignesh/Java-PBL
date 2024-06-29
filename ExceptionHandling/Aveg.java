package ExceptionHandling;

import java.util.Scanner;

public class Aveg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int sum=0;
            for(int i=0;i<5;i++)
            {
                sum+=Integer.parseInt(args[i]);
            }
            System.out.println("Sum is "+sum);
            System.out.println("Average is "+sum/5);
       
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
    }
}
