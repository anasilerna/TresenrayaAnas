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
            
            // Validar que la casilla esté entre 1 y 9
            if (casilla < 1 || casilla > 9) {
                System.out.println("Casilla no válida. Intenta de nuevo.");
                continue;
            }
         // Convertir la casilla (1-9) a la posición fila y columna
            int fila = 0, columna = 0;

            // Condicional para convertir la casilla a fila y columna
            if (casilla >= 1 && casilla <= 3) {
                fila = 0;  // Fila 0
                columna = casilla - 1;  // Columna 0, 1 o 2
            } else if (casilla >= 4 && casilla <= 6) {
                fila = 1;  // Fila 1
                columna = casilla - 4;  // Columna 0, 1 o 2
            } else if (casilla >= 7 && casilla <= 9) {
                fila = 2;  // Fila 2
                columna = casilla - 7;  // Columna 0, 1 o 2
            }
         // Verificar si la casilla seleccionada ya está ocupada
            if (tablero[fila][columna] != ' ') {
                System.out.println("Casilla ocupada. Intenta de nuevo.");
                continue; // Si la casilla está ocupada, se solicita de nuevo
            }
            
            // Marcar la casilla con el símbolo del jugador
            tablero[fila][columna] = turno;
            movimientos++;
            
            // Verificar si hay un ganador en filas, columnas o diagonales
            ganador = false;



	}

}
