package com.itfactory.extensii;

import com.itfactory.abstractClasses.UnitateBancara;
import com.itfactory.model.Persoana;

public class BancaPentruNevoiPersonale extends UnitateBancara {
    @Override
    public double calculeazaCredit(Persoana persoana) {
        return persoana.getSalariuNet() * 10;
    }

    @Override
    public double calculeazaDobanda(Persoana persoana) {
        return calculeazaCredit(persoana) * 8 / 100;
    }
}
