package model;

public class TiketBisnis extends Ekspedisi {

    private boolean makan;

    public TiketBisnis(int km, int berat, boolean makan) {
        super(km, berat);
        this.makan = makan;
    }

    public boolean isMakan() {
        return makan;
    }

    public void setMakan(boolean makan) {
        this.makan = makan;
    }

}
