package All;

import java.util.Scanner;

public class woman {

    public void classifyPatient(int age, double temp, int pain) {
        // clasificación según edad
        String AgeCategory = "";
        if (age >= 0 && age <= 1) {
            AgeCategory = "bebé";
        } else if (age >= 2 && age <= 10) {
            AgeCategory = "niño";
        } else if (age >= 11 && age <= 18) {
            AgeCategory = "adolescente";
        } else if (age >= 19 && age <= 65) {
            AgeCategory = "adulto";
        } else {
            AgeCategory = "adulto mayor";
        }

        // clasificación según temperatura
        String tempCategory = "";
        if (temp < 35.5) {
            tempCategory = "hipotermia";
        } else if (temp >= 35.5 && temp <= 37.5) {
            tempCategory = "temperatura normal";
        } else {
            tempCategory = "fiebre";
        }

        // clasificación según dolor
        String painCategory = "";
        String recomendation = "";
        if (pain >= 8) {
            painCategory = "dolor intenso";
            recomendation = "Barbie debe administrar un analgésico.";
        } else if (pain >= 5 && pain <= 7) {
            painCategory = "dolor moderado";
            recomendation = "Barbie debe recomendar reposo y analgésicos.";
        } else {
            painCategory = "dolor leve";
            recomendation = "Barbie asegura que el paciente se recuperará pronto.";
        }

        // resultados
        System.out.println("\nResultados de la clasificación:");
        System.out.println("Edad del paciente: " + age + " años (" + AgeCategory + ")");
        System.out.println("Temperatura del paciente: " + temp + "°C (" + tempCategory + ")");
        System.out.println("Nivel de dolor del paciente: " + pain + " (" + painCategory + ")");
        System.out.println(recomendation);
    }
}
