package br.com.alura;

public class TesteCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

		// FORMA 1
		Aula aula1 = new Aula("Trabalhando com ArrayList", 21);
		javaColecoes.adiciona(aula1);

		// FORMA 2
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno ("Rodrigo", 34672);
		Aluno a2 = new Aluno ("Guilherme", 5672);
		Aluno a3 = new Aluno ("Mauricio", 5672);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("Está matriculado? (objeto)"+javaColecoes.estaMatriculado(a1));
		
		// teste recebendo dado formulario busca
		
		Aluno turini = new Aluno("Rodrigo", 34672);
		System.out.println("Está metriculado? (string nome) "+javaColecoes.estaMatriculado(turini));
		System.out.println("equals: " + a1.equals(turini));
		
		
	}
}
