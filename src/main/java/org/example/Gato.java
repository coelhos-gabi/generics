package org.example;

public class Gato {
    private int idade;
    private String nome;
    private String cor;

    public Gato(int idade, String nome, String cor) {
        this.idade = idade;
        this.nome = nome;
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }
}
