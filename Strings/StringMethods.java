package Strings;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter String 1: ");
        str1=sc.nextLine();
        System.out.print("Enter String 2: ");
        str2=sc.nextLine();

       System.out.println(concateStr("Vikki", "iceCream"));
       System.out.println(gethalf("vikkis"));
       System.out.println(gethalf("Vikki"));

       System.out.println(getStr("Vicky"));
       System.out.println(Shorterlonger("Vicky", "viki"));
       System.out.println(strwithoutastric("Vi*kk*i"));
       System.out.println(repeate3chars("Vicky", 5));
       System.out.println(alternativeString("Vignesh", "Vicky"));
    }


     public static String concateStr(String s,String m)
     {
        s=s.toLowerCase();
        m=m.toLowerCase();
        StringBuffer res=new StringBuffer();
        res.append(s);
        if(s.charAt(s.length()-1)== m.charAt(0))
        {
            res.append(m.substring(1));
            return res.toString();
        }
         res.append(m);
        return res.toString();
     }

     public static String  gethalf(String tr)
     {
        if(tr.length()%2==0)
         return tr.substring(0,tr.length()/2);
        return null;
     }

     public static String getStr(String s)
     {
        return s.substring(1,s.length()-1);
     }

     public static String Shorterlonger(String a,String b)
     {
        if(a.compareTo(b)==0)
          return a+b;
        else if(a.compareTo(b)>=1)
          return b+a+b;
        return a+b+a;
     }


     public static String strwithoutastric(String str)
     {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='*')
              s.append(str.charAt(i));
        }
        return s.toString();
     }


     public static String repeate3chars(String s,int n)
     {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            str.append(s.substring(n-1,s.length()-1));
        }
        return str.toString();
     }

     public static String alternativeString(String a,String b)
     {
        StringBuffer sb=new StringBuffer();
       int i=0,j=0;
       while(i<=a.length()-1 && j<=b.length()-1)
        {
            sb.append(a.charAt(i++));
            sb.append(b.charAt(j++));
        }
        while(j!=b.length()-1)
        {
            sb.append(j++);
        }
        while (i!=a.length()-1) {
            sb.append(i++);
        }
        return sb.toString();
     }
}