import java.util.Scanner;

public class SumofNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st number : ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        b=sc.nextInt();
        int n=a+b;
        String res=n%2==0 ? "Even":"Odd";
        System.out.println("Result "+n+" is "+res);
    }
}
