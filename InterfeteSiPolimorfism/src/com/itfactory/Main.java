package com.itfactory;

import com.itfactory.implementari.BancaPentruLocuinte;
import com.itfactory.implementari.BancaPentruNevoiPersonale;
import com.itfactory.interfaces.UnitateBancara;
import com.itfactory.model.Persoana;
import com.itfactory.utils.Utils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UnitateBancara unitateBancara;
        String raspuns;

        do {
            Persoana persoana = Utils.citestePersoana();
            if (persoana.getVarsta() < 18) {
                System.out.println("Persoana nu este eligibila pentru un credit intrucat este minora.");
            } else if (persoana.getVarsta() <= 40) {
                unitateBancara = new BancaPentruLocuinte();
                System.out.println("Persoana " + persoana + " se incadreaza la un credit pentru locuinte in valoare de: " + unitateBancara.calculeazaCredit(persoana) + " RON, cu o dobanda aferenta de " + unitateBancara.calculeazaDobanda(persoana) + " RON in total.");
            } else {
                unitateBancara = new BancaPentruNevoiPersonale();
                System.out.println("Persoana " + persoana + " se incadreaza la un credit pentru nevoi personale in valoare de: " + unitateBancara.calculeazaCredit(persoana) + " RON, cu o dobanda aferenta de " + unitateBancara.calculeazaDobanda(persoana) + " RON in total.");
            }

            System.out.print("Mai doriti o simulare ? Daca da, tastati \"Y\", iar daca doriti sa parasiti aplicatia, tastati orice alt caracter: ");
            raspuns = scanner.nextLine();
            System.out.print("\n");
        } while (raspuns.equals("y".toLowerCase()));
    }

}
