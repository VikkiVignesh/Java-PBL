import java.util.Arrays;
import java.util.Scanner;

public class DecreasingSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Result res=getresults(arr, n);
        System.out.println("Number of decreasing Sequences in the array is "+ res.op1);
        System.out.println("Maximum  decreasing Sequence is "+res.op2);
    }

    static class Result
    {
        int op1;
        int op2;
        Result(int x,int y)
        {op1=x;
        op2=y;
        }
    }

    public static Result getresults(int a[],int size)
    {
        int cnt=0;
        int longestseq=0;
        int currseq=0;
        for(int i=0;i<size-1;i++)
        {
            if(a[i]>a[i+1])
            {
                if(currseq==0)
                  cnt++;
                currseq++;
            }
            else
            {
                if(currseq>longestseq)
                {
                    longestseq=currseq;
                    currseq=0;
                }
            }
        }
        if(currseq>longestseq)
        {
            longestseq=currseq;
        }
        if(longestseq>0)
        {
            longestseq++;
        }
        return new Result(cnt,longestseq);
    }

}

