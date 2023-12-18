package jatekok;

public class Balra extends Helyszin{

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
    
}
