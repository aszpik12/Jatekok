package jatekok;

public class Jatekok {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
       Karakter karakter1 = new Karakter();
        karakter1.felvesz(new Felszereles("arany","aranypenz"));
        karakter1.felvesz(new Felszereles("arany","aranypenz"));
        karakter1.felvesz(new Felszereles("arany","aranypenz"));
        karakter1.felvesz(new Felszereles("bronz","bronzpenz"));
        karakter1.felvesz(new Felszereles("bronz","bronzpenz"));
        karakter1.felvesz(new Felszereles("bronz","bronzpenz"));
        karakter1.felvesz(new Felszereles("bronz","bronzpenz"));
        karakter1.felvesz(new Felszereles("arany","aranypenz"));
        System.out.println(karakter1.toString());
        karakter1.hasznal("arany");
        System.out.println(karakter1.toString());
        karakter1.hasznal("bronz",  2);
        System.out.println(karakter1.toString());
        karakter1.hasznal("arany", 3, true);
        System.out.println(karakter1.toString());
        Jatek jatek1 = new Jatek();
        jatek1.betolt();
        jatek1.elment();
        
       
    }
}
