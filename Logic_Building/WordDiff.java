import java.util.Scanner;

public class WordDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence");
        String str=sc.nextLine();
        System.out.println("Word Difference Pattern of "+str+" is : "+getPattern(str));
    }

    public static int getDigit(char c)
    {
        return Character.toLowerCase(c)-'a'+1;
    }
    public static int calculatesum(String s)
    {
        int sum=0;
        for(int i=0;i<s.length()/2;i++)
        {
            sum+=Math.abs(getDigit(s.charAt(i))-getDigit(s.charAt(s.length()-1-i)));
        }
        if(s.length()%2!=0)
        {
            sum+=getDigit(s.charAt(s.length()/2));
        }
        return sum;
    }

    public static String getPattern(String s)
    {
        String wrds[]=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<wrds.length;i++)
        {
           res.append(calculatesum(wrds[i]));

        }
        return res.toString();
    }

}
