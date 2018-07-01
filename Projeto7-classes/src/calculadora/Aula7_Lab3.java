package calculadora;

public class Aula7_Lab3 {
	
	public static void main(String args []){
		Calculadora calc = new Calculadora();
		
		
		System.out.println("calc.somar(6,3) = " +calc.somar(3,6));
		System.out.println("calc.subtrair(6,3) = " +calc.subtrair(6,3));
		System.out.println("calc.multiplicar(6,3) = " +calc.multiplicar(6,3));
		System.out.println("calc.somar(3,6) = " +calc.dividir(6,3));
		
		System.out.println("Metodos Subtrair sobrecarregados:");
		System.out.println("Chamando a versão de subtrair com 2 double: " +calc.subtrair(6.2,3.1));
		System.out.println("Chamando a versão de subtrair com 1 double e 1 1nt: " +calc.subtrair(6.2,2));
		System.out.println("Chamando a versão de subtrair com 1 int e 1 double: " +calc.subtrair(6,3.2));		
		
	}

}
