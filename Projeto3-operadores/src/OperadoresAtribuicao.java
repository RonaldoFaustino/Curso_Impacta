
public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
	
		double salario = 1200;
		salario += 300;
		salario -=300;
		
		double bonificacao = 600;
		bonificacao *=2;
		
		double desconto = salario+ bonificacao;
		//desconto /= 2;
		desconto %= 1000;
		
		System.out.println(salario);
		System.out.println(bonificacao);
		System.out.println(desconto);
	}

}
