import java.util.Arrays;
import java.util.Scanner;

public class SimpleEncoding {

    static class OriginalContent
    {
        int Elem;
        int sum;
        OriginalContent(int a,int b)
        {
            Elem=a;
            sum=b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sixe of Encoded Array");
        int n=sc.nextInt();
        int encoded[]=new int[n];
        for(int i=0;i<encoded.length;i++)
        {
            encoded[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(encoded));
        
        OriginalContent Result=getOutputs(encoded,n);
        System.out.println(Result.Elem);
        System.out.println(Result.sum);
    }

    public static OriginalContent getOutputs(int a[],int size)
    {
         int origin[]=getarr(a);
         int sum=0;
         for(int i=0;i<origin.length;i++)
         {
            sum+=origin[i];
         }
         return new  OriginalContent(origin[0], sum);
    }

    public static  int[] getarr(int a[])
    {
        int res[]=new int[a.length];
        res[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            res[i]=a[i]-res[i];
        }
        System.out.println("Original Array is "+Arrays.toString(res));
        return res;
    }

}
