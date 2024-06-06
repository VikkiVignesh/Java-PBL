package OopsConcept;

import java.util.Scanner;

public class Calculator {
    

   public static int powerInt(int num1,int num2)
   {
    return (int)Math.pow(num1, num2);
   } 
   public static double powerdouble(int x,int y)
   {
    return Math.pow(x, y);
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter any Two Numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Integer Value "+powerInt(a, b));
    System.out.println("Double Value "+powerdouble(a, b));
   }
}
