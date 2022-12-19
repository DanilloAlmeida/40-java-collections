package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		
		
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

		// FORMA 1
		Aula aula1 = new Aula("Trabalhando com ArrayList", 21);
		javaColecoes.adiciona(aula1);

		// FORMA 2
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		

	}

}
