package tresenraya;

import java.util.Scanner;
import java.util.Random;

public class tresenraya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
     // Scanner para preguntar nombres de los jugadores
        System.out.println("Ingrese el nombre del Jugador 1: ");
        String jugador1 = scanner.nextLine();
        System.out.println("Ingrese el nombre del Jugador 2: ");
        String jugador2 = scanner.nextLine();
        
        
     // Decidir aleatoriamente quién empieza
        String turnoJugador = random.nextBoolean() ? jugador1 : jugador2;
        char turno = 'X'; // Empieza con la x

        System.out.println("Tiro la moneda y " + turnoJugador + " empieza primero!");
        
        
        // Inicio del tablero vacío
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        boolean ganador = false; // Variable para verificar si ya hay un ganador
        int movimientos = 0; // Contador de movimientos 
        
        
        // El ciclo sigue hasta que haya un ganador o el número de movimientos sea 9 (empate)
        while (!ganador && movimientos < 9) {
            // Mostrar el tablero
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " "); // Imprime cada casilla
                }
                System.out.println(); // Salto de línea después de cada fila
            }
            
         // Solicitar al jugador que elija una casilla (1-9)
            System.out.println("Turno de " + turnoJugador + " (" + turno + "). Elige una casilla (1-9): ");
            int casilla = scanner.nextInt();
	}

}
