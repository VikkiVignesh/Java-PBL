package Packages.Automobiles.TwoWheeler;

import Packages.Automobiles.Vehicles;

public class Hero extends Vehicles {
    String Model;
    String RegNum;
    String Owner;
    int speed;

    public Hero(String x,String y,String o,int s)
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

  public void radio()
  {
    System.out.println("Radio is Activating in Hero!!!!");
  }
}
