package com.sovos.salariocal;

import com.sovos.abs.Employee;

public class PorHora extends Employee {

    private double valor, horas;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }


    public PorHora(String Nome, String Familia, double valor, double horas) {
        super(Nome, Familia);
        this.valor = valor;
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "PorHora: " + super.toString();
    }

    @Override
    public double ganhar() {
        return horas * valor;// total de horas vezes total de
    }
}
