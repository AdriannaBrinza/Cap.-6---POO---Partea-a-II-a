package com.itfactory.utils;

import com.itfactory.model.Persoana;
import java.util.Scanner;

public class Utils {

    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static Persoana citestePersoana() {
        System.out.print("Introduceti numele persoanei: ");
        String nume = scanner.nextLine();
        System.out.print("Introduceti varsta d-nei/ d-lui " + nume + ": ");
        int varsta = Integer.parseInt(scanner.nextLine());
        String cnp;
        do {
            System.out.print("Introduceti CNP-ul d-nei/d-lui " + nume + ": ");
            cnp = scanner.nextLine();
        } while (cnp.length() != 13);
        System.out.print("Introduceti salariul net al d-nei/d-lui " + nume + ": ");
        double salariuNet = Double.parseDouble(scanner.nextLine());
        return new Persoana(nume, varsta, cnp, salariuNet);
    }
}
