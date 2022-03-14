package com.sovos.salariocal;

import com.sovos.abs.Employee;

public class PorComissao extends Employee {

    private double salario, comicao;
    private int vendas;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComicao() {
        return comicao;
    }

    public void setComicao(double comicao) {
        this.comicao = comicao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public PorComissao(String Nome, String Familia, double salario, double comicao, int vendas) {
        super(Nome, Familia);
        this.salario = salario;
        this.comicao = comicao;
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "PorComissao: "+ super.toString();
    }

    @Override
    public double ganhar() {
        return salario + (comicao * vendas);
    }
}
