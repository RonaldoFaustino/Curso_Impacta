
public class Exercicio {

	public static void main(String[] args) {
		
		int numero = 12;
		int divisoes = 0;
		
		for(int x=1; x<numero;x++){
		if(numero % x ==0)
			divisoes ++;
		}
		if(divisoes <= 2)
			System.out.println(numero + " � primo");
		else
			System.out.println(numero +" n�o � primo");

	}

}
