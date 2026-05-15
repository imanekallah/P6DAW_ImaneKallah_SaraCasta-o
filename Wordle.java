package juegoPalabra;

public class Wordle {
    //Las constantes de los colores para el titulo
	public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    
    private static final String PALABRAS_FILE = "Palabras5L.txt";
    private static final String SAVE_FILE = "wordle_save.dat";
    private static final int MAX_INTENTOS = 6;
    
    private List<String> palabras;
    private Partida partidaActual;
    private Puntuacion sistemaPuntuaciones;
    private Scanner scanner;
    
	


    public static void menu(){
		Scanner sc = new Scanner(System.in);
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
