package jatekok;

public class Balra extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Üdv a bal oldalon";
    }

    @Override
    public String egyikBtnFelirata() {
        return "Észak";
    }

    @Override
    public Helyszin egyikIrany() {
        return null;
    }

    @Override
    public String masikBtnFelirata() {
        return "Dél";
    }

    @Override
    public Helyszin masikIrany() {
        return null;
    }

}
