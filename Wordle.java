package juegoPalabra;

public class Wordle {

	public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String ROJO = "\u001B[31m";
    public static final String GRIS = "\u001B[90m";

	public static void titulo(){
	System.out.println(AMARILLO+"          La Palabra del Día          "+RESET);	
	}


    
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;

		do{
			titulo();
			System.out.println("")
 		}while(opcion!=0);
	}

}
