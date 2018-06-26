
public class Teste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();  // instaciando a variavel c1 
		c1.numero = 2005;
		c1.nome = "Vera";
		c1.saldo = 800.0;
		
		System.out.println("Dados da conta:");
		System.out.println(c1.nome);
		System.out.println(c1.numero);
		System.out.println(c1.saldo);
		
	}

}
