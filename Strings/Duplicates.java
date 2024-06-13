package Strings;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String :");
        String str=sc.nextLine();
        System.out.println("Enter the number of times char to printed : ");
        int n=sc.nextInt();
        System.out.println("Generated String is : "+generateString(str, n));
    }

    public static String generateString(String str,int c)
    {
        StringBuffer res=new StringBuffer();
        for(int i=0;i<=c;i++)
        {
          res.append(str.substring(0,2));
        }
        return res.toString();
    }
}
