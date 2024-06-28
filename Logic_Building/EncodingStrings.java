import java.util.Scanner;

/*
 * String Spliting rule
 * if string length is exactly divisible by 3 then split it interms of multiple of 3
 * if string length is leaving remainder as 1 when  divide with 3 ,then split the string with 1 extra char in middle
 * if string length is leaving remainder as 1 when qe divide with 3 ,then split the string with 1 extra char in front and end except mid
 */
public class EncodingStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1=sc.nextLine();
        System.out.println("Enter String 2");
        String str2=sc.nextLine();
        System.out.println("Enter String 3");
        String str3=sc.nextLine();

        String s1[]=process(str1);
        String s2[]=process(str2);
        String s3[]=process(str3);

        String op1=s1[0]+s2[0]+s3[0];
        String op2=s1[1]+s2[1]+s3[1];
        String op3=s1[2]+s2[2]+s3[2];

        System.out.println("Printing Results");
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(Toogle(op3));
    }

    public static String [] process(String str)
    {
        int len=str.length();
        int paretlen=len/3;
        int rem=len%3;
        String front,mid,end;
        if(rem==0)
        {
            front=str.substring(0,paretlen);
            mid=str.substring(paretlen,2*paretlen);
            end=str.substring(2*paretlen);
        } 
        else if(rem==1)
        {
            front=str.substring(0,paretlen);
            mid=str.substring(paretlen,2*paretlen+1);
            end=str.substring(2*paretlen+1);
        }
        else
        {
            front=str.substring(0,paretlen+1);
            mid=str.substring(paretlen+1,2*paretlen+1);
            end=str.substring(2*paretlen+1);
        }
        return new String[]{front,mid,end};
    }

    public static String Toogle(String s)
    {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
            else{
                str.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        return str.toString();
    }
}
