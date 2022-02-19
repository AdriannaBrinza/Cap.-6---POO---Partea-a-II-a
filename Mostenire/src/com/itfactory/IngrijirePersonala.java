package com.itfactory;

public class IngrijirePersonala extends Produs {

    private boolean returnabil;

    public IngrijirePersonala(String numeProdus, double pret, int discount, boolean returnabil) {
        super(numeProdus, pret, discount);
        this.returnabil = returnabil;
    }

    public boolean isReturnabil() {
        return returnabil;
    }

}