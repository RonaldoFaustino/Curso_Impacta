package aula7lab1;

public class Aula7_Lab1 {
	public static void main(String args[]){
		
		Funcionario joao = new Funcionario();
		joao.nome = "João";
		joao.sobrenome = "Pedro";
		joao.cargo = "Programador";
		joao.salario = 4000;
		
		System.out.print("Nome : " + joao.nome);
		System.out.print("Sobrenome : " + joao.sobrenome);
		System.out.print("Cargo : " + joao.cargo);
		System.out.print("Salario: " + joao.salario);
		
	}

}
