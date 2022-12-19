package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto");
		alunos.add("Nico Turini");
		alunos.add("Sergio Turini");
		alunos.add("Lopes Turini");
		alunos.add("Renan Turini");
		alunos.add("Mauricio Turini");
		
		//imprimir forma1
		System.out.println("imprimir forma1");
		System.out.println(alunos);

		//imprimir forma2
		System.out.println("\nimprimir forma2");
		for (String nome : alunos) {
			System.out.println(nome);
		}
		
		//imprimir forma3
		System.out.println("\nimprimir forma3");
		alunos.forEach(nome2 -> {
			System.out.println(nome2);
		});
				
	}
}
