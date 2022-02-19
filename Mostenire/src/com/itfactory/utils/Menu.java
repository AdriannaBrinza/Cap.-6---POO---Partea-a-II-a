package com.itfactory.utils;

import com.itfactory.Electronice;
import com.itfactory.Imbracaminte;
import com.itfactory.IngrijirePersonala;
import java.util.Scanner;

public class Menu {

    public static void displayMenu() {
        System.out.println("Alegeti una din optiunile de mai jos pentru a calcula pretul unui produs din categoria: \n" +
                "1 - Imbracaminte\n" +
                "2 - Ingrijire Personala\n" +
                "3 - Electronice\n" +
                "0 - Iesire din aplicatie\n" +
                "-----------------------------");
    }


    public static void option1() {
        Imbracaminte imbracaminte = Utils.citesteImbracaminte();
        switch (imbracaminte.getTipImbracaminte().toLowerCase()) {
            case "pantaloni": {
                imbracaminte.setDiscount(10);
                break;
            }
            case "bluza": {
                imbracaminte.setDiscount(20);
                break;
            }
            case "accesoriu": {
                imbracaminte.setDiscount(30);
                break;
            }
            default: {
                System.out.println("Ati introdus un alt produs decat \"pantaloni\", \"bluza\" sau \"imbracaminte\".");
            }
        }
        System.out.println("Pretul produsului " + imbracaminte.getNumeProdus() + " este: " + imbracaminte.calculeazaPretFinal() + "\n");
    }


    public static void option2() {
        IngrijirePersonala ingrijirePersonala = Utils.citesteIngrijirePersonala();
        if (ingrijirePersonala.isReturnabil()) {
            ingrijirePersonala.setDiscount(0);
        } else {
            ingrijirePersonala.setDiscount(20);
        }
        System.out.println("Pretul produsului " + ingrijirePersonala.getNumeProdus() + " este: " + ingrijirePersonala.calculeazaPretFinal() + "\n");
    }


    public static void option3() {
        Electronice electronice = Utils.citesteElectronice();
        if (electronice.getVoltaj() >= 220 && electronice.getVoltaj() <= 240) {
            System.out.println("Pretul produsului " + electronice.getNumeProdus() + " este: " + electronice.calculeazaPretFinal());
        } else {
            System.out.println("Produsul nu poate fi folosit la o priza ce prevede reglementarile europene");
        }
    }


    public static void parseOptions() {
        Scanner scanner = new Scanner(System.in);
        try {
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    option1();
                    break;
                }
                case 2: {
                    option2();
                    break;
                }
                case 3: {
                    option3();
                    break;
                }
                default:
                    System.out.println("Introduceti un numar de la 0 la 3. Multumim!");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Trebuie sa introduceti o valoare numerica. Nu se accepta litere sau caractere speciale.");
        }
    }

}
