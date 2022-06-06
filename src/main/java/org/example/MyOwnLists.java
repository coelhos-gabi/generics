package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * asListedSorted deve ter dois valores, um array de valores de um
 * determinado tipo T e um Comparator de mesmo tipo.
 * Este método deve retornar uma lista (List) de elementos do tipo T
 * ordenados pela definição do Comparator.
 * Permita que seja possível transformar qualquer array de um
 * determinado tipo em uma lista de mesmo tipo de forma ordenada.
 * Um exemplo de como seu método deverá ser chamado.
*/
public class MyOwnLists<T> {

    public static <T> List<T> asListedSorted(List <T> lista, Comparator<T> comparator){
        List<T> listaOrdenada = new ArrayList<>();

        for (T elemento : lista) {
            listaOrdenada.add(elemento);
        }
        Collections.sort(listaOrdenada,comparator);
        return listaOrdenada;
    }

}
