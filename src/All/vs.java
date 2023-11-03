package All;

import java.util.Random;
import java.util.Scanner;

public class vs {

    public void playGame() {
        Scanner capture = new Scanner(System.in);
        Random random = new Random();

        String[] heroes = {"Superman(piedra)", "Batman(papel)", "Flash(tijera)"};

        System.out.println("BIENVENIDO A SUPERMAN, BATMAN, FLASH (Piedra papel o tijera pero de héroes)");

        System.out.println("Elije una opción (Superman-piedra, Batman-papel, o Flash-tijeras):");
        String heroSelected = capture.nextLine();

        // Genera el héroe aleatorio después de la elección del usuario
        String randomHero = heroes[random.nextInt(heroes.length)];
        System.out.println("Tu oponente ha elegido: " + randomHero);

        if (heroSelected.equals(randomHero)) {
            System.out.println("La partida es un empate");
        } else {
            switch (heroSelected) {
                case "Superman(piedra)":
                    if (randomHero.equals("Batman(papel)") || randomHero.equals("Flash(tijera)")) {
                        System.out.println("¡Ganaste!");
                    } else {
                        System.out.println("Tu oponente gana");
                    }
                    break;
                case "Batman(papel)":
                    if (randomHero.equals("Flash(tijera)")) {
                        System.out.println("¡Ganaste!");
                    } else {
                        System.out.println("Tu oponente gana");
                    }
                    break;
                case "Flash(tijera)":
                    if (randomHero.equals("Superman(piedra)")) {
                        System.out.println("¡Ganaste!");
                    } else {
                        System.out.println("Tu oponente gana");
                    }
                    break;
            }
        }

        capture.close();
    }
}
