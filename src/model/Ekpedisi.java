package model;

abstract class Ekspedisi {
    private int km;
    private int berat;
    
    public Ekspedisi(int km, int berat) {
        this.km = km;
        this.berat = berat;
    }
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }


}
