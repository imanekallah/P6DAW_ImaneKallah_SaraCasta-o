package juegoPalabra;

public class Wordle {

	public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String ROJO = "\u001B[31m";
    public static final String GRIS = "\u001B[90m";

	


    public static void menu(){
		static Scanner sc = new Scanner(System.in);
		int opcion;
		    System.out.println(AMARILLO+"          La Palabra del Día          "+RESET);	

		do{
			System.out.println("Selecciona una opción");
			System.out.println("1- Cargar partida");
			System.out.println("2- Nuevo juego");
			System.out.println("3- Consultar puntuación");
			System.out.println("4- Salir");
			opcion=sc.nextInt();
			switch opcion {
				case 1 ->
				case 2 ->
				case 3 -> 
				case 4 -> 
			}
 		}while(opcion!=0);
	}
	
	public static void main(String[] args) {
		
	}

}
