package control;

import java.util.Scanner;
public class Control {
    static Scanner scan = new Scanner(System.in);
    
    public static double itungEkonomi(int km, int berat){
        int harTetep = 7500;
        int harBarang = 0;
        double hargaBerat = 0;
        double hargaJarak = harTetep * km;
        if (berat > 5) {
            harBarang = 1500;
            hargaBerat = berat * harBarang;
        }
        double hargaTotal = hargaBerat + hargaJarak;
        return hargaTotal;
    };

    public static double itungBisnis(int km, int berat, boolean makan){
        int harBarang = 0;
        int hargaBerat = 0;
        double hargaTotal = 0;
        double hargaJarak = km * 10000;
        if (berat > 5) {
            harBarang = 2500;
            hargaBerat = berat * harBarang;
            hargaTotal = hargaBerat + hargaJarak;
        }

        if (makan) {
           double hargaBelumTotal = (hargaBerat + hargaJarak);
           hargaTotal = hargaBelumTotal + (hargaBelumTotal * (10/100));
        }

        return hargaTotal;
    };

    public static double itungFirst(int km, int berat, boolean asuransi){
        double hargaTotal = 0;
        hargaTotal = km * 15000;

        if (asuransi) {
            double hargaBelumTotal = (km * 15000);
            hargaTotal = hargaBelumTotal + (hargaBelumTotal * (10/100));
        }

        return hargaTotal;
    };
}
