package ExceptionHandling;

import java.util.Scanner;

class InvalidCountryName extends Exception
{
  String name;
  public InvalidCountryName(String s)
  {
    this.name=s;
  }

  public String toString()
  {
    return name;
  }
}
public class UserRegistration {
    public void Register(String name,String cntry)
    {
        try {
            if(!cntry.equals("India"))
             throw new InvalidCountryName("User Outside India can't Register!!");
            else
             System.out.println("User Registration done Successfully!!");
        } catch (InvalidCountryName e) {
           System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the User name and Country");
        new UserRegistration().Register(sc.nextLine(), sc.nextLine());
    }
}
