package com.sovos.salariocal;

import com.sovos.abs.Employee;

public class PorItem extends Employee {
    private double producao;
    private int quantidade;

    public PorItem(String Nome, String Familia, double producao, int quantidade) {
        super(Nome, Familia);
        this.producao = producao;
        this.quantidade = quantidade;
    }

    public double getProducao() {
        return producao;
    }

    public void setProducao(double producao) {
        this.producao = producao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public double ganhar() {
        return producao * quantidade;// fazer a conta (valor de produçao * quantidade produzida)
    }

    @Override
    public String toString() {
        return "PorItem: " + super.toString();
    }
}
