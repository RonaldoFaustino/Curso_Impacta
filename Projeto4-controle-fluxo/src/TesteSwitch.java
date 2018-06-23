
public class TesteSwitch {

	public static void main(String[] args) {
		
		String pais = "Mexico";
		
		switch (pais){
			case "Brasil":
			case "Portugal":
				System.out.println("Bom dia");
				break;
			case "Espanha": 
			case "Mexico":
			case "Argentina":
				System.out.println("Buenos dias");
				break;
			case "Franca":
				System.out.println("Bon Jour");
				break;
			default:
				System.out.println("Good Morning");
			
		}
		

	}

}
