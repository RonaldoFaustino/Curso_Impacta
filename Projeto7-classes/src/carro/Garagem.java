package carro;

public class Garagem {
	
	public Carro carroPasseio = new Carro();
	public Carro carrosUtilitario = new Carro();
	
	public static void main(String[]args){
		
		Garagem g = new Garagem();
		g.carroPasseio.cor = "vermolho";
		g.carroPasseio.modelo = "VW Jetta";
		g.carroPasseio.potencia = 2.3;
				
		g.carrosUtilitario.cor = "Branco";
		g.carrosUtilitario.modelo = "Renault";
		g.carrosUtilitario.potencia = 3.8;
		
		System.out.println("Carro de Passeio: ");
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("modelo: " + g.carroPasseio.modelo);
		System.out.println("Potencia: " + g.carroPasseio.potencia);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Carro Utilitario: ");
		System.out.println("Cor: " + g.carrosUtilitario.cor);
		System.out.println("Cor: " + g.carrosUtilitario.modelo);
		System.out.println("Cor: " + g.carrosUtilitario.potencia);
		
		
		
		
		
		
		
	}

}
