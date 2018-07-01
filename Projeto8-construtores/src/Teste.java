
public class Teste {
	
	public static void main (String[]args){
	
	Conta c1 = new Conta(4003, "Manuel", 1530.60);
	Conta c2 = new Conta(4003, "Rafael", 1830.60);
	Conta c3 = new Conta(4003, "Lucas", 1000.60);
	
	System.out.println(c1.getDados());
	System.out.println(c2.getDados());
	System.out.println(c3.getDados());
	}
}
