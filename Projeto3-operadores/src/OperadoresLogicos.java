
public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		int idade = 21;
		
		char sexo = 'M';
		
		String tipo = (sexo == 'M'? "Masculino" : "Feminino");
		
		boolean result = (idade >= 18 && sexo == 'M');
		
		boolean result1 = !(idade >= 18);
		
		System.out.println(result);
		
		System.out.println(result1);
		
		System.out.println(tipo);
			
		
	}

}
