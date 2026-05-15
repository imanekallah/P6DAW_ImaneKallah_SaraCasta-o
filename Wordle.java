package juegoPalabra;

public class Wordle {
    
    private static final String SAVE_FILE = "wordle_save.dat";
    private static final int MAX_INTENTOS = 6;
    
    private List<String> palabras;
    private Partida partidaActual;
    private Puntuacion sistemaPuntuaciones;
    private Scanner scanner;
    
	

    // Menú
    public static void menu(){
		Scanner sc = new Scanner(System.in);
		int opcion;
		    System.out.println("=======================================");
		    System.out.println("==         La Palabra del Día        ==");
		    System.out.println("=======================================");

		do{
			System.out.println("Selecciona una opción");
			System.out.println("1- Cargar partida");
			System.out.println("2- Nuevo juego");
			System.out.println("3- Consultar puntuación");
			System.out.println("4- Salir");
			opcion=sc.nextInt();
			switch opcion {
				case 1 -> cargarPartida();
				case 2 -> nuevoJuego();
				case 3 -> consultarPuntuaciones();
				case 4 -> 
			}
 		}while(opcion!=0);
	}

	//Cargar lista de palabras del archivo Palabras5L.txt
	 private void cargarPalabras() {
		 BufferedReader reader=null;
		 String contenido;
        try (reader = new BufferedReader(new FileReader("Palabras5L.txt"))) {
            contenido = reader.readLine();
           if (contenido != null && !contenido.trim().isEmpty()) {
                String[] palabrasArray = contenido.split(", ");
                palabras = new ArrayList<>();
                
                // Filtrar palabras de 5 letras usando foreach
                for (String palabra : palabrasArray) {
                    String palabraTrim = palabra.trim();
                    if (palabraTrim.length() == 5) {
                        palabras.add(palabraTrim);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar palabras: " + e.getMessage());
            palabras = new ArrayList<>();
        }
    }

	
	public static void main(String[] args) {
		menu();
	}

}
