package model;

public class Tiket extends Ekspedisi{
    private String level;
    
    public Tiket(int km, int berat, String level) {
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
