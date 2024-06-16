package Packages.TestPackage;

public class Foundation {
    private int a=10; //Can Be accessed only inside the class
    int b=20;// Can br accessed only inside the pacakage
    protected int c=30; //can acessed only inside the child class
    public int d=40; //can be acessed any where in the package as well as other packages

    public int geta()
    {
        return a;
    }
}
