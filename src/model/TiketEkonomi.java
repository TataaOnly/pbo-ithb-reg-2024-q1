package model;

public class TiketEkonomi extends Ekspedisi{
    private String level;

    public TiketEkonomi(int km, int berat, String level) {
        super(km, berat);
        this.level = level;
    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
