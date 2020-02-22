package seminar1;

import java.util.Date;

public abstract class ElementPatrimonial implements Amortizare{
    private String denumire;
    private long nrInventar;
    private double valoare;
    private Date dataAchizitie;

    public ElementPatrimonial() {
    }

    public ElementPatrimonial(String denumire, long nrInventar, double valoare, Date dataAchizitie) {
        this.denumire = denumire;
        this.nrInventar = nrInventar;
        this.valoare = valoare;
        this.dataAchizitie = dataAchizitie;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public long getNrInventar() {
        return nrInventar;
    }

    public void setNrInventar(long nrInventar) {
        this.nrInventar = nrInventar;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    public Date getDataAchizitie() {
        return dataAchizitie;
    }

    public void setDataAchizitie(Date dataAchizitie) {
        this.dataAchizitie = dataAchizitie;
    }

    @Override
    public String toString() {
        return "ElementPatrimonial{" +
                "denumire='" + denumire + '\'' +
                ", nrInventar=" + nrInventar +
                ", valoare=" + valoare +
                ", dataAchizitie=" + dataAchizitie +
                '}';
    }
}
