package Packages.Automobiles;

import Packages.Automobiles.FourWheeler.Ford;
import Packages.Automobiles.FourWheeler.Logan;
import Packages.Automobiles.TwoWheeler.Hero;
import Packages.Automobiles.TwoWheeler.Honda;

public class Test {
    public static void main(String[] args) {
        Hero herosplender=new Hero("Splender368", "KA03RT4567", "Raj", 40);
        Honda shine=new Honda("Shine110c", "Ka53KG2869", "Vikki", 60);
        System.out.println("Printing Hero Details");
        System.out.println("Model : "+herosplender.getModelName());
        System.out.println("RegNum : "+herosplender.getRegistartionNumber());
        System.out.println("Owner : "+herosplender.getModelName());
        System.out.println("Current Speed : "+herosplender.getSpeed());
        herosplender.radio();
        System.out.println("Printing Honda Details");
        System.out.println("Model : "+shine.getModelName());
        System.out.println("RegNum : "+shine.getRegistartionNumber());
        System.out.println("Owner : "+shine.getModelName());
        System.out.println("Current Speed : "+shine.getSpeed());
        shine.cdplayer();

        Ford ford=new Ford("Ford Tec", "KA02RH5689", "Vicky", 100);
        Logan lg=new Logan("Logan","KA06TK0945","Vijay",80);

        System.out.println("Printing Ford Car Details");
        System.out.println("Model : "+ford.getModelName());
        System.out.println("RegNum : "+ford.getRegistartionNumber());
        System.out.println("Owner : "+ford.getModelName());
        System.out.println("Current Speed : "+ford.getSpeed());
        System.out.println("Ford's Temperature  : "+ford.tempcontrol());

        System.out.println("Printing Logan car Details");
        System.out.println("Model : "+lg.getModelName());
        System.out.println("RegNum : "+lg.getRegistartionNumber());
        System.out.println("Owner : "+lg.getModelName());
        System.out.println("Current Speed : "+lg.getSpeed());
       System.out.println("Logan's GPS Location : "+lg.gps());
        
    }
}
