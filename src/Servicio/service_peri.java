package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author duran
 */
public class service_peri {

    // creacio del scanner 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Circunferencia circu = new Circunferencia();

    public Circunferencia CrearCircunferencia() {
        System.out.println("System for calculate the radio");
        System.out.println("Ingresa el radio: ");
        circu.setRadio(leer.nextDouble());
        return null;
    }

    public double area() {

        CrearCircunferencia();
        double radio = circu.getRadio();
        double area = Math.PI * radio * 2;
        circu.setArea(area);
        System.out.println("the area is: " + area);
        return area;

    }

    public double perimetro() {
        area();
        double area = circu.getArea();
        double perimetro = Math.PI * 2 * area;
        System.out.println("the perimeter is: " + perimetro);
        return perimetro;
    }
}
