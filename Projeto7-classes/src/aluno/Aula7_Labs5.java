package aluno;

public class Aula7_Labs5 {

	public static void main(String[] args) {
		
		Aluno joao = new Aluno();
		joao.setNome("Jo�o");
		joao.contadorDeAlunos++;
		joao.imprimeAluno();
		System.out.println("Contagem do Objeto jo�o: " + joao.contadorDeAlunos + "/n");
	
	
		Aluno maria = new Aluno();
		maria.setNome("Jo�o");
		maria.contadorDeAlunos++;
		maria.imprimeAluno();
		System.out.println("Contagem do Objeto Maria: " + maria.contadorDeAlunos + "/n");
		
		Aluno pedro = new Aluno();
		pedro.setNome("Jo�o");
		pedro.contadorDeAlunos++;
		pedro.imprimeAluno();
		System.out.println("Contagem do Objeto Maria: " + pedro.contadorDeAlunos + "/n");
		
		//Impress�o usando a referencia estatica correta
		System.out.println("Contador acessando diretamente da classe: " + Aluno.contadorDeAlunos);
		
	}
}
