import java.util.Scanner;

public class PinGenertion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence ");
        String sen=sc.nextLine();
        String wrds[]=sen.split(" ");
        int sum=0;
        for(String wrd:wrds)
        {
            sum+=wrd.length();
        }
        if(sum>0 && sum<10)
        {
            System.out.println("Generated PIN is "+sum);
        }
        else
          System.out.println("Generated PIN is "+getsum(sum));

    }

    public static int getsum(int s)
    {
        int sum=0;
        while(s!=0)
        {
            sum+=s%10;
            s/=10;
        }
        return sum;
    }

}