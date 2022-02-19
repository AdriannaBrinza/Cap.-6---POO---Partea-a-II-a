package com.itfactory.implementari;

import com.itfactory.interfaces.UnitateBancara;
import com.itfactory.model.Persoana;

public class BancaPentruLocuinte implements UnitateBancara {

    @Override
    public double calculeazaCredit(Persoana persoana) {
        return persoana.getSalariuNet() * 100;
    }

    @Override
    public double calculeazaDobanda(Persoana persoana) {
        return calculeazaCredit(persoana) * 5 / 100;
    }
}
