package com.itfactory.utils;

import com.itfactory.Electronice;
import com.itfactory.Imbracaminte;
import com.itfactory.IngrijirePersonala;
import com.itfactory.Produs;
import java.util.Scanner;

public class Utils {

    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static Produs citesteProdus() {
        System.out.print("Introduceti numele produsului: ");
        String numeProdus = scanner.nextLine();
        System.out.print("Introduceti pretul produsului: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Introduceti discountul pentru acest produs: ");
        int discount = Integer.parseInt(scanner.nextLine());
        return new Produs(numeProdus, price, discount);
    }

    public static Imbracaminte citesteImbracaminte() {
        System.out.println("Citim un produs de tip Imbracaminte.");
        Produs produs = citesteProdus();
        System.out.print("Introduceti tipul de imbracaminte: pantaloni, bluza sau accesoriu: ");
        String tipImbracaminte = scanner.nextLine();
        return new Imbracaminte(produs.getNumeProdus(), produs.getPret(), produs.getDiscount(), tipImbracaminte);
    }

    public static IngrijirePersonala citesteIngrijirePersonala() {
        System.out.println("Citim un produs de tip Ingrijire Personala.");
        Produs produs = citesteProdus();
        System.out.print("Tastati \"true\" daca produsul este returnabil, sau \"false\" daca nu este returnabil: ");
        boolean returnabil = Boolean.parseBoolean(scanner.nextLine());
        return new IngrijirePersonala(produs.getNumeProdus(), produs.getPret(), produs.getDiscount(), returnabil);
    }

    public static Electronice citesteElectronice() {
        System.out.println("Citim un produs de tip Electronice.");
        Produs produs = citesteProdus();
        System.out.print("Introduceti voltajului acestui produs electronic: ");
        int voltaj = Integer.parseInt(scanner.nextLine());
        return new Electronice(produs.getNumeProdus(), produs.getPret(), produs.getDiscount(), voltaj);
    }

}