package All;

import java.util.Scanner;

public class pulga_vs_bicho {

    public static void clasificarJugador(String nombreJugador, String nombreEquipo) {
        nombreJugador = nombreJugador.toLowerCase();
        nombreEquipo = nombreEquipo.toLowerCase();

        if (nombreJugador.equals("ronaldo") && nombreEquipo.equals("real madrid")) {
            System.out.println("Cristiano Ronaldo es una leyenda en el Real Madrid. ¡Es bueno siuuu!");
        } else if (nombreJugador.equals("messi") && nombreEquipo.equals("barcelona")) {
            System.out.println("¡Lionel Messi es un ídolo en el Barcelona! Es lo bueno, rico y sabroso encarnado.");
        } else if ((nombreJugador.equals("messi") && nombreEquipo.equals("real madrid")) || (nombreJugador.equals("ronaldo") && nombreEquipo.equals("barcelona"))) {
            System.out.println("El jugador ingresado no está en la lista del equipo seleccionado.");
        } else if (!(nombreEquipo.equals("barcelona") || nombreEquipo.equals("real madrid"))) {
            System.out.println("El equipo ingresado no es válido. Solo se permite Barcelona o Real Madrid.");
        } else {
            System.out.println("El jugador ingresado no está en la lista de Barcelona ni Real Madrid.");
        }
    }
}
