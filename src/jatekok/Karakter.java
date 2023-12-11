package jatekok;
    
import java.util.ArrayList;

public class Karakter {
   private int eletero, ugyesseg, szerencse;
   private ArrayList<String> felszereles;

    public Karakter(ArrayList<String> felszereles) {
        this.eletero = 2 * random();
        this.ugyesseg = random();
        this.szerencse = random();
        this.felszereles = felszereles;
    }

    private static int random() {
        return (int) ((Math.random() * (6 - 1)) + 1);
    }

    public int getEletero() {
        return eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    public ArrayList<String> getFelszereles() {
        return felszereles;
    }
    
    
   
}
