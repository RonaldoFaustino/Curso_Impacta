package cadastro;

public class Aula8_lab1 {
	
	public static void main(String arg[]){
		Cadastro c1 = new Cadastro();
		Cadastro c2 = new Cadastro("Claudio","Abreu");
		Cadastro c3 = new Cadastro("Lourder", "Souza", 40);
		
		c1.mostrar();
		c2.mostrar();
		c3.mostrar();
	}

}
