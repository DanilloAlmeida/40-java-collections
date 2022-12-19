package br.com.alura;

//import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
//		List<Aula> aulas = javaColecoes.getAulas();
		
//		Aula aula1 = new Aula("Trabalhando com ArrayList", 1);
//		aulas.add(aula1);

		//FORMA 1
		Aula aula1 = new Aula ("Trabalhando com ArrayList", 21);
		javaColecoes.adiciona(aula1);
		
//		FORMA 2
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
