package jatekok;

public class Kezdes extends Helyszin {

    @Override
    public String leiras() {
        return "Ez a Kezdes!";
    }

    @Override
    public Helyszin egyikIrany() {

        return null;
    }

    @Override
    public String egyikBtnFelirata() {
        return "még tovább";
    }

}
