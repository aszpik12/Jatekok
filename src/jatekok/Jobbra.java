package jatekok;

public class Jobbra extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {

        return "ez a jobboldal";
    }

    @Override
    public String egyikBtnFelirata() {
        return "Kelet";
    }

    @Override
    public Helyszin egyikIrany() {

        return null;
    }

    @Override
    public String masikBtnFelirata() {
       return "Nugyat"; 
    }

    @Override
    public Helyszin masikIrany() {
    return null;
    }

}
