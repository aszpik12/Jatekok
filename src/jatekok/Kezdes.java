package jatekok;

public class Kezdes extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Ez a Kezdes! Jobbra vagy balra?";
    }

    @Override
    public Helyszin egyikIrany() {

        return new Jobbra();
    }

    @Override
    public String egyikBtnFelirata() {
        return "jobbra";
    }

    @Override
    public Helyszin masikIrany() {
        return new Balra();
    }

    @Override
    public String masikBtnFelirata() {
    return "balra";
    }

}
