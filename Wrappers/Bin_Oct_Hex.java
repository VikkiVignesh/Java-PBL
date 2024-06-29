package Wrappers;

public class Bin_Oct_Hex {
    public static void main(String[] args) {
        try {
            System.out.println("Binary :"+binary(Integer.parseInt(args[0])));
            System.out.println("Octal :"+Octa(Integer.parseInt(args[0])));
            System.out.println("HexaDecimal :"+hexa(Integer.parseInt(args[0])));

            System.out.println("8 Bit Integer : "+get8bit_bin(Integer.parseInt(args[0])));
        } 
        catch(NumberFormatException e)
        { System.out.println(e);}
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int  binary(int a)
    {
        StringBuilder str=new StringBuilder();
        while (a!=0) {
            str.insert(0,a%2);
            a/=2;
        }
       return Integer.parseInt(str.toString());
    }

    public static int  Octa(int a)
    {
        StringBuilder str=new StringBuilder();
        while (a!=0) {
            str.insert(0,a%8);
            a/=8;
        }
       return Integer.parseInt(str.toString());
    }

    public static int hexa(int s)
    {
        char arr[]="0123456789ABCDEF".toCharArray();
        StringBuilder str=new StringBuilder();
        while(s!=0)
        {
           str.insert(0,arr[s%16]);
           s/=16;
        }

        return Integer.parseInt(str.toString());
    }


    public static int get8bit_bin(int s)
    {
        StringBuilder str=new StringBuilder();
        while (s!=0) {
            str.insert(0, s%2);
            s/=2;
        }

        return Integer.parseInt(String.format("%09d",Integer.parseInt(str.toString())));

        
        // while(str.length()!=8)
        // {
        //     str.insert(0, str);
        // }
        // return Integer.parseInt(str.toString());
    }
}
