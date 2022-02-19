package com.itfactory;

public class Produs {

    private String numeProdus;
    private double pret;
    private int discount;

    public Produs(String numeProdus, double pret, int discount) {
        this.numeProdus = numeProdus;
        this.pret = pret;
        if (discount >= 0 && discount <= 100) {
            this.discount = discount;
        }
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public double getPret() {
        return pret;
    }

    public int getDiscount() {
        return discount;
    }

    public double calculeazaPretFinal() {
        return pret - (pret * discount / 100);
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

}