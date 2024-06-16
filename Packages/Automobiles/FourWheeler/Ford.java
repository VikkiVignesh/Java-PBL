package Packages.Automobiles.FourWheeler;

import java.util.Random;

import Packages.Automobiles.Vehicles;

public class Ford extends Vehicles{
    String Model;
    String RegNum;
    String Owner;
    int speed;

    public Ford(String x,String y,String o,int s)
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

  public int  tempcontrol()
  {
    System.out.println("Current Temperature is ");
    return new Random().nextInt(10,50);
  }
}
