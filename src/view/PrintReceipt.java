package view;

import model.*;
import control.*;
import java.util.Scanner;

public class PrintReceipt {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Masukan level \n" + "1. Ekonomi \n" + "2. Bisnis \n" + "3. First Class");
        int level = scan.nextInt();

        switch (level) {
            case 1:
                System.out.println(itungEkonomi());
                break;

            default:
                break;
        }

    }
}
