public class Loops {
    public static void main(String[] args) {
        
        print_1_n(100);
        print_1_n_by2(100);
        print_0_n_by2(100);
        print_rev(100);
        print_revby2(100);
    }


    public static void print_1_n(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void print_1_n_by2(int n)
    {
        for(int i=1;i<=n;i=i+2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void print_0_n_by2(int n)
    {
        for(int i=0;i<=n;i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void print_rev(int n)
    {
        for(int i=n;i>=0;i--)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void print_revby2(int n)
    {
        for(int i=n;i>=0;i-=3)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
