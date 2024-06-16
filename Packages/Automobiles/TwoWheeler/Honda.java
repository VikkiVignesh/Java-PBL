package Packages.Automobiles.TwoWheeler;

public class Honda {
    String Model;
    String RegNum;
    String Owner;
    int speed;

   public Honda(String x,String y,String o,int s)
    {
        Model=x;
        RegNum=y;
        Owner=o;
        speed=s;
    }
    public int getSpeed()
    {
        return speed;
    }
  public String getModelName()
 {
    return Model;
 }
  public String getRegistartionNumber()
 {
    return RegNum;
 }
  public String getOwnerName()
  {
    return Owner;
  }
  public void cdplayer()
  {
    System.out.println("Cdplayer is Activating in Honda Car!!!!");
  }
}
