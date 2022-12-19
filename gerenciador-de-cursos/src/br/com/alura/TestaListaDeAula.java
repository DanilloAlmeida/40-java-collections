package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Aula a1 = new Aula ("Revisando as ArraysLists", 21); 
		Aula a2 = new Aula ("Listas de objetos", 15); 
		Aula a3 = new Aula ("Relacionamento de listas e objetos", 14);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		Collections.sort(aulas);
		//oredenando por aula
		System.out.println(aulas);
		aulas.sort(Comparator.comparing(Aula::getTempo));
		//oredenando por tempo
		System.out.println(aulas);
	}
}
