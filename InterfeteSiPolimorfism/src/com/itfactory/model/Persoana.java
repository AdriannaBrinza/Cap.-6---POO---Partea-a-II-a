package com.itfactory.model;

public class Persoana {
    private String nume;
    private int varsta;
    private String cnp;
    private double salariuNet;

    public Persoana(String nume, int varsta, String cnp, double salariuNet) {
        this.nume = nume;
        this.varsta = varsta;
        this.cnp = cnp;
        this.salariuNet = salariuNet;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getCnp() {
        return cnp;
    }

    public double getSalariuNet() {
        return salariuNet;
    }

    @Override
    public String toString() {
        return "{Nume: " + nume + ", " + varsta + " ani, CNP: " + cnp + ", salariu net: " + salariuNet + ".}";
    }
}
