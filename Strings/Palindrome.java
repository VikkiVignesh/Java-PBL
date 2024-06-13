package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str=sc.nextLine();

       if(checkpalindrome(str))
       {
        System.out.println("String is Palindrome..");
       }
       else{
        System.out.println("String is not Palindrome..");
       }
    }
    public static boolean checkpalindrome(String str)
    {
        StringBuffer res=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            res.insert(0, str.charAt(i));
        }
        return str.equals(res.toString());
    }
}
