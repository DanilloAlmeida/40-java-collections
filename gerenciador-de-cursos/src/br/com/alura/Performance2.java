package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class Performance2 {

	public static void main(String[] args) {
//MEDINDO ARRAYLIST
//**************************************************************************
        Collection<Integer> numeros = new ArrayList<Integer>();
        long inicio = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println("Tempo gasto ArrayList: " + tempoDeExecucao);

//MEDINDO HASHSET
//**************************************************************************
        Collection<Integer> numerosSet = new HashSet<>();
        long inicio2 = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
        	numerosSet.add(i);
        }
        for (Integer numero : numerosSet) {
        	numerosSet.contains(numero);
        }
        long fim2 = System.currentTimeMillis();
        long tempoDeExecucao2 = fim2 - inicio2;
        System.out.println("Tempo gasto HashSet: " + tempoDeExecucao2);
//**************************************************************************
    }

}
