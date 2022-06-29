package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
* Crie a classe MyOwnLists com um método asListedSorted estático.
* Este método deve ter dois valores, um array de valores de um
* determinado tipo T e um Comparator de mesmo tipo.
* Este método deve retornar uma lista (List) de elementos do tipo T
* ordenados pela definição do Comparator.
* Permita que seja possível transformar qualquer array de um
* determinado tipo em uma lista de mesmo tipo de forma ordenada.
* Um exemplo de como seu método deverá ser chamado.
*
* List<Empregado> empregadosList
* = MyOwnLists.asListedSorted(new Empregado[]{new Empregado()},
*                           new Comparator<Empregado>(){...});
*
* Crie uma classe principal (main) chamando o seu método para mais
* de um tipo de dado e para mais de um elemento no vetor de cada tipo.
* */


public class GenericsExercicio {
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();
        Empregado empregado1 = new Empregado("Gabriela", 21, BigDecimal.valueOf(2000));
        Empregado empregado2 = new Empregado("Andressa", 22, BigDecimal.valueOf(4000));
        Empregado empregado3 = new Empregado("Roberta", 18, BigDecimal.valueOf(3000));

        empregados.add(empregado1);
        empregados.add(empregado2);
        empregados.add(empregado3);

        List<Empregado> empregadosList = MyOwnLists.asListedSorted(
                empregados, (e1,e2)-> e1.getNome().compareTo(e2.getNome()));

        for(Empregado empregado: empregadosList){
            System.out.println("Nome: " + empregado.getNome());
            System.out.printf("Matrícula: %d %n", empregado.getMatricula());
        }
        System.out.println("--------------------------------------------------");
        List<Gato> listaAnimais = new ArrayList<>();
        Gato animal1 = new Gato(4,"Bichano","Marrom");
        Gato animal2 = new Gato(2,"Lili", "Preto");
        Gato animal3 = new Gato(8,"Whisky", "Cinza");
        listaAnimais.add(animal1);
        listaAnimais.add(animal2);
        listaAnimais.add(animal3);

        List<Gato> animaisOrdenados = MyOwnLists.asListedSorted(listaAnimais,
                Comparator.comparingInt(Gato::getIdade));
        for(Gato gato : animaisOrdenados){
            System.out.println("Nome: " + gato.getNome());
            System.out.println("Cor: " + gato.getCor());
            System.out.println("Idade: " + gato.getIdade());
        }
    }
}

