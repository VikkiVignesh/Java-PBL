import java.util.Scanner;

public class Deci_octa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any Number : ");
        n=sc.nextInt();
        System.out.println("Decimal to Octal Number value : "+getOctal(n));
    }

    public static String getOctal(int n)
    {
        StringBuilder str=new StringBuilder();
        while (n!=0) {
            int rem=n%8;
            str.insert(0, rem);
            n/=8;
        }
        return str.toString();
    }


}
