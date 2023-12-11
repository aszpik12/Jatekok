package jatekok;

import java.util.UUID;

public class Felszereles {
   private String nev, leiras;
   private UUID id;

    public Felszereles(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = UUID.randomUUID();
    }
   
   
}
