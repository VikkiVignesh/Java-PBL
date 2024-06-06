import java.util.Scanner;

public class Deci_to_Bin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal Number");
        int n=sc.nextInt();
     System.out.println("Number"+n+"in Binary Form "+convert(n));

     System.out.println("Binary to Decimal "+getdecimal(convert(n)));
    }

    public static String convert(int n) {
        StringBuilder str=new StringBuilder();
        if(n==0)
         return "0";
        while (n > 0) 
        {
            int rem=n%2;
            str.insert(0,rem);
            n=n/2;
        }
       return str.toString();
    }

    public static int getdecimal(String str)
    {
        int res=0;
        int len=str.length()-1;
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)=='1')
           {
            res+=Math.pow(2, len-i);
           }   
        }
        return res;
    }
}
