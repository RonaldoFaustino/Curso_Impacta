
public class Teste {

	public static void main(String[] args) {
		//Classe Conta
		Conta c1 = new Conta();  // instaciando a variavel c1 
		c1.numero = 2005;
		c1.nome = "Vera";
		c1.depositar(2500.00);
		//c1.saldo = 2500.0;
		
		c1.depositar(1000);
		//c1.saldo += 1000;
		
		c1.retirar(2000);
		//c1.saldo -=2000;
		
		System.out.println("Dados da conta:");
		System.out.println(c1.nome);
		System.out.println(c1.numero);
		System.out.println(c1.getSaldo());
		
	}

}
