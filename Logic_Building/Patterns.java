public class Patterns {
    public static void main(String[] args) {
        Inc_dec(10);
        alpha(10);
        diamond(10);
    }
    public static void Inc_dec(int n) {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print(k);
            }
            for(int l=i;l>0;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void alpha(int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            if( i>=2)
            {
                for(char c=(char)(64+i-1);c>=65;c--)
                {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print(k);
            }
            for(int l=i;l>0;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print(k);
            }
            for(int l=i;l>0;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

