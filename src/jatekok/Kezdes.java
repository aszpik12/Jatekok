package jatekok;

public class Kezdes extends Helyszin {

    @Override
    public String leiras() {
        return "Ez a Kezdes! Jobbra vagy balra?";
    }

    @Override
    public Helyszin egyikIrany() {

        return new Balra();
    }

    @Override
    public String egyikBtnFelirata() {
        return "Balra";
    }

}
