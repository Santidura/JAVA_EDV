/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package All;

import java.util.Scanner;

/**
 *
 * @author duran
 */
public class Main {
    
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          
          
        /* //hero chousse 
       hero myHero = new hero();

        myHero.favoritePower();
        myHero.strengthLevel();
        myHero.heroAge();
        myHero.heroBattle();
        myHero.canFly();
        myHero.SuperheroEnemiesProgram();
        myHero.SuperheroLeagueProgram();
        myHero.SuperheroSpecialAbilityProgram();
        
        */
        
        
         /* //messi ronaldo
        System.out.println("Bienvenido al programa de clasificación de Ronaldo y Messi en Barcelona y Real Madrid.");
        System.out.println("Por favor, ingrese el nombre del jugador y el nombre del equipo.");

        System.out.print("Nombre del jugador (Ronaldo o Messi): ");
        String nombreJugador = scanner.nextLine();

        System.out.print("Nombre del equipo (Barcelona o Real Madrid): ");
        String nombreEquipo = scanner.nextLine();

        pulga_vs_bicho.clasificarJugador(nombreJugador, nombreEquipo);

        System.out.println("Gracias por utilizar el programa de clasificación. ¡Hasta luego!");

        scanner.close(); */
         
         
        /* //vs heroes
         vs superheroGame = new vs();
            superheroGame.playGame();
            */
        
        //woman barbie
        
         System.out.println("Bienvenido a la Clínica de Barbie, la doctora clasificadora.");
        System.out.println("Vamos a clasificar a los pacientes según su edad, temperatura y nivel de dolor.");

        System.out.print("¿Cual es tu edad?: ");
        int age = scanner.nextInt();

        System.out.println("¿Cual es tu temperatura en grados celsius?");
        double temp = scanner.nextDouble();

        System.out.println("¿Cual es tu nivel de dolor?");
        int pain = scanner.nextInt();

        woman womanClinic = new woman();
        womanClinic.classifyPatient(age, temp, pain);

        System.out.println("Gracias por utilizar el programa de clasificación. ¡Hasta luego!");

        scanner.close();
    }
}
