import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String 1");
       String str1=sc.nextLine();
       System.out.println("Enter String 2");
       String str2=sc.nextLine();
       System.out.println("Addition of Two Strings "+getaddition(str1, str2));
    }

    public static String getaddition(String s1,String s2)
    {
        StringBuffer res=new StringBuffer();
        int n1=s1.length()-1;
        int n2=s2.length()-1;
        int carry=0;
        while(n1>=0|| n2>=0)
        {
            int x=(n1>=0)?s1.charAt(n1)-'0':0;
            int y=(n2>=0)?s2.charAt(n2)-'0':0;
            int sum=x+y+carry;
            carry=sum/10;
            res.insert(0, sum%10);
            n1--;
            n2--;
        }
        if(carry>0)
        {
            res.insert(0,carry);
        }
        return res.toString();
    }
}
