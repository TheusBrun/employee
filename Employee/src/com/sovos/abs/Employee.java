package com.sovos.abs;

public abstract class Employee {

    private String Nome;
    private String Familia;


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getFamilia() {
        return Familia;
    }

    public void setFamilia(String familia) {
        Familia = familia;
    }

    public Employee(String Nome, String Familia){
        this.Nome = Nome;
        this.Familia = Familia;

/*
        System.out.println("Nome: "+ Nome +" Familia: "+ Familia);
*/
    }

    @Override
    public String toString() {
        return Nome +" "+ Familia;

    }

    public abstract double ganhar();

}
