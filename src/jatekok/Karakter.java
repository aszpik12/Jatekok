package jatekok;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Karakter implements Serializable {

    private int eletero, ugyesseg, szerencse;
    private final ArrayList<Felszereles> felszerelesek;

    public Karakter() {
        felszerelesek = new ArrayList<>();
        this.eletero = kockad() + kockad() + 12;
        this.ugyesseg = kockad() + 6;
        this.szerencse = kockad() + 6;
    }

    private static int kockad() {
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

    public ArrayList<Felszereles> getFelszerelesek() {
        return felszerelesek;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public void setUgyesseg(int ugyesseg) {
        this.ugyesseg = ugyesseg;
    }

    public void setSzerencse(int szerencse) {
        this.szerencse = szerencse;
    }
    
    public void felvesz(Felszereles targy)
    {
        felvesz(targy, 1);
    }
    
    public void felvesz(Felszereles targy, int db)
    {
        for (int i = 0; i < db; i++)
        {
            felszerelesek.add(targy);
        }
    }

    public void hasznal(String nev) {
        this.hasznal(nev, 1);
    }

    public void hasznal(String nev, int menny) {
        this.hasznal(nev, menny, false);
    }

    public void hasznal(String nev, int menny, boolean hasznalja) {
        {
            int felszerelesmennyiseg = 0;
            for (Felszereles felszereles : felszerelesek) {
                if (felszereles.getNev().compareTo(nev) == 0) {
                    felszerelesmennyiseg++;
                }
            }
            if (felszerelesmennyiseg > 0) {
                if (felszerelesmennyiseg >= menny || hasznalja) {
                    int i = felszerelesek.size() - 1;
                    int hasznaltossz = 0;
                    while (i >= 0 && hasznaltossz <= menny) {
                        if (felszerelesek.get(i).getNev().compareTo(nev) == 0) {
                            felszerelesek.remove(i--);
                            hasznaltossz++;
                        }
                        i--;
                    }
                    System.out.printf("Elhasznált tárgy(ak): %ddb %s\n", hasznaltossz, nev);
                } else {
                    System.out.println("Nincs elég ilyen tárgy a felszerelésben!");
                }
            } else {
                System.out.println("Nincs ilyen tárgy a felszerelésben!");
            }
        }
    }
}
