package jatekok;

import java.util.ArrayList;
import java.util.Collections;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<String> felszerelesek;

    public Karakter() {
        this.eletero = random() + random() + 12;
        this.ugyesseg = random() + 6;
        this.szerencse = random() + 6;
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

    public ArrayList<String> getFelszerelesek() {
        return felszerelesek;
    }

    public void felvesz(Felszereles targy) {
        this.felvesz(targy, 1);
    }

    public void felvesz(Felszereles targy, int menny) {
        for (int i = 0; i < menny; i++) {
            this.felszerelesek.add(targy);
        }
    }

    public void hasznal(String nev) {
        this.hasznal(nev, 1);
    }

    public void hasznal(String nev, int menny) {

        if (felszerelesek.contains(nev)) {
            this.hasznal(nev, menny, true);
        } else {
            System.out.println("Nincs " + nev + " nevezetű tárgyad");
        }

    }

    public void hasznal(String nev, int menny, boolean hasznalja) {

        int meglevo = Collections.frequency(felszerelesek, nev);

        if (hasznalja == true) {
            if (menny < meglevo) {
                System.out.println("Nincs elegendő " + nev);
            } else {
                System.out.println("elhasznált " + menny + "-nyi " + nev + "-t.");
                for (int i = 0; i < menny; i++) {
                    felszerelesek.remove(nev);
                }
            }
        } else {
            System.out.println("nem használta a(z) " + nev + "-t");
        }
    }
}
