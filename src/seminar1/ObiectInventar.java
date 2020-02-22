package seminar1;

import java.util.Date;

public class ObiectInventar extends ElementPatrimonial {
    private String gestionar;

    public ObiectInventar() {
    }

    public ObiectInventar(String denumire, long nrInventar, double valoare, Date dataAchizitie, String gestionar) {
        super(denumire, nrInventar, valoare, dataAchizitie);
        this.gestionar = gestionar;
    }

    public String getGestionar() {
        return gestionar;
    }

    public void setGestionar(String gestionar) {
        this.gestionar = gestionar;
    }

    @Override
    public String toString() {
        return "ObiectInventar{" +
                "gestionar='" + gestionar + '\'' +
                "} " + super.toString();
    }

    @Override
    public double uzura() {
        return 0;
    }
}
