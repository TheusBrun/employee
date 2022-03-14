package com.sovos.salariocal;

import com.sovos.abs.Employee;

public class Chefe extends Employee {
    private double salario = 1000.00;//(salario fixo e predefinido)


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Chefe(String Nome, String Familia, double salario) {
        super(Nome, Familia);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Chefe: " +
                super.toString();
    }

    @Override
    public double ganhar() {
        return salario;
    }
}
