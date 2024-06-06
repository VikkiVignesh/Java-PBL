package OopsConcept;

import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Width,height and depth of the box :");
        int w=sc.nextInt();
        int h=sc.nextInt();
        int d=sc.nextInt();
        Box box=new Box(w, h, d);
        System.out.println("Volume of Box is "+box.calculate_volume());
    }
}
class Box
{
    int heigth,width,depth;
    Box(int x,int y,int z)
    {
        width=x;
        heigth=y;
        depth=z;
    }
    public int calculate_volume()
    {
        int res=width*heigth*depth;
        return res;
    }
}
