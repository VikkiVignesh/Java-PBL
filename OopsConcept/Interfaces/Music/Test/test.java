package OopsConcept.Interfaces.Music.Test;

import OopsConcept.Interfaces.Music.*;
import OopsConcept.Interfaces.Music.String.Veena;
import OopsConcept.Interfaces.Music.Wind.Saxophone;
public class test {
    public static void main(String[] args) {
        Veena veeena =new Veena();
        Saxophone saxo=new Saxophone();

        Playable Play;
        Play=veeena;
        Play.play();
        Play=saxo;
        Play.play();
    }
}
