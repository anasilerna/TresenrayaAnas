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
	}

}
