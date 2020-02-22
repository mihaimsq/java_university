package seminar1;

public enum Categorie {
    TERENURI(211), CLADIRI(212), UTILAJE(213), MOBILIER(214), MJ_TRANSPORT(215);
    private int simbol;

    Categorie(int simbol) {
        this.simbol = simbol;
    }

    public int getSimbol() {
        return simbol;
    }

    public void setSimbol(int simbol) {
        this.simbol = simbol;
    }
}
