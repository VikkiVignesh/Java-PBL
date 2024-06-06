import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number : ");
        n=sc.nextInt();
        String res=n%2==0 ? "Even":"Odd";
        System.out.println("Entered Number is "+res);
    }
}