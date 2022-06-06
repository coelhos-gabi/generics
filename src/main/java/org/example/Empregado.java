package org.example;

import java.math.BigDecimal;
import java.util.Comparator;

public class Empregado implements Comparable {
    private String nome;
    private int matricula;
    protected BigDecimal salario;

    public Empregado(String nome, int matricula, BigDecimal salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.printf("%s está trabalhando... %n", this.nome);
    }
    public void baterPonto() {
        System.out.printf("%s bateu o ponto %n", this.nome);
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }
    public int getMatricula(){
        return this.matricula;
    }

    @Override
    public int compareTo(Object other) {
        Empregado empregado = (Empregado) other;
        if (this.matricula < empregado.matricula) {
            return -1;
        }
        if (this.matricula > empregado.matricula) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Empregado\n" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}

