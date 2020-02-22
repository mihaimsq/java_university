package seminar1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ObiectInventar obiectInventar = new ObiectInventar();
        obiectInventar.setDenumire("Laptop Fujitsu");
        obiectInventar.setNrInventar(1524);
        obiectInventar.setDataAchizitie(new Date());
        obiectInventar.setValoare(5600);
        obiectInventar.setGestionar("Bakios Dara");
        System.out.println(obiectInventar);

        MijlocFix mijlocFix = new MijlocFix("Sediu central", 2115, 25000, new Date(), 100, Categorie.CLADIRI);
        System.out.println(mijlocFix);
    }
}
