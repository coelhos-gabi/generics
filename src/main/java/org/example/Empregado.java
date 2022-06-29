package org.example;

import java.math.BigDecimal;
import java.util.Comparator;

public class Empregado {
    private String nome;
    private int matricula;
    protected BigDecimal salario;

    public Empregado(String nome, int matricula, BigDecimal salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula(){
        return this.matricula;
    }
}

