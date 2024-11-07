package view;

import java.util.Scanner;
import control.Control;
public class PrintReceipt {

    static Scanner scan = new Scanner(System.in);

    public static void PrintData(){
        System.out.println("Masukan level \n" + "1. Ekonomi \n" + "2. Bisnis \n" + "3. First Class");
        int level = scan.nextInt();
    
        switch (level) {
            case 1:
                System.out.println("Level: Ekonomi\n" + "Total Harga:" + itungEkonomi());
                break;
            case 2:
                System.out.println("Level: Bisnis\n" + "Total Harga" + itungBisnis());
                break;
            case 3:
                System.out.println("Level: First Class\n" + "Total Harga" + itungFirst());
                break;
            default:
                break;
        }

    }
}
