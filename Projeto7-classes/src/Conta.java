
public class Conta {  //Classe Conta
	
	public int numero;    
	public String nome;		// Atributos numero, nome, saldo
	private double saldo;
	
	public void depositar(double v){
		
		saldo +=v;
	}
		
	public void retirar(double v){
		//if(v<= saldo)
			//saldo-=v;
		//else
			//System
		saldo -=v;
	}
	
	public double getSaldo(){
		return saldo;
	}
}
