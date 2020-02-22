package seminar1;

import java.util.Date;

public class MijlocFix extends ElementPatrimonial {
    private int durataNormata;
    private Categorie categorie;

    public MijlocFix() {
    }

    public MijlocFix(String denumire, long nrInventar, double valoare, Date dataAchizitie, int durataNormata, Categorie categorie) {
        super(denumire, nrInventar, valoare, dataAchizitie);
        this.durataNormata = durataNormata;
        this.categorie = categorie;
    }

    public int getDurataNormata() {
        return durataNormata;
    }

    public void setDurataNormata(int durataNormata) {
        this.durataNormata = durataNormata;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "MijlocFix{" +
                "durataNormata=" + durataNormata +
                ", categorie=" + categorie +
                "} " + super.toString();
    }

    @Override
    public double uzura() {
        return 0;
    }
}
