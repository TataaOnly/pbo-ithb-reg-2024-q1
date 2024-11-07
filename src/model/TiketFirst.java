package model;

public class TiketFirst extends Ekspedisi {

    private boolean asuransi;

    public TiketFirst(int km, int berat, boolean asuransi) {
        super(km, berat);
        this.asuransi = asuransi;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

}
