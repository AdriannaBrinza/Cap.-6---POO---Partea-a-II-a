package com.itfactory;

public class Imbracaminte extends Produs {

    private String tipImbracaminte;

    public Imbracaminte(String numeProdus, double pret, int discount, String tipImbracaminte) {
        super(numeProdus, pret, discount);
        this.tipImbracaminte = tipImbracaminte;
    }

    public String getTipImbracaminte() {
        return tipImbracaminte;
    }

    public void setTipImbracaminte(String tipImbracaminte) {
        this.tipImbracaminte = tipImbracaminte;
    }

}