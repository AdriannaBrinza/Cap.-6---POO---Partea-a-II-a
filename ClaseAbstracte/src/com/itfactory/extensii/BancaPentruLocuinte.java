package com.itfactory.extensii;

import com.itfactory.abstractClasses.UnitateBancara;
import com.itfactory.model.Persoana;

public class BancaPentruLocuinte extends UnitateBancara {

    @Override
    public double calculeazaCredit(Persoana persoana) {
        return persoana.getSalariuNet() * 100;
    }

    @Override
    public double calculeazaDobanda(Persoana persoana) {
        return calculeazaCredit(persoana) * 5 / 100;
    }

}