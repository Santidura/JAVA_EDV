/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author duran
 */
public class service_rect {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    Rectangulo read = new Rectangulo();

    public void crearRect() {
        System.out.println("This is a program that model a rect");
        System.out.println("For his base and alt");
        System.out.println("Insert the base: ");
        double base = scanner.nextDouble();
        read.setBase(base);
        System.out.println("Insert the alt: ");
        double altura = scanner.nextDouble();
        read.setAltura(altura);
        dibujarRectangulo();
        perimetro();
        superficie();
    }

    public double superficie() {
        double base = read.getBase();
        double altura = read.getAltura();
        double total = base * altura;
        System.out.println("The surface is: " + total);
        return total;
    }

    public double perimetro() {
        double base = read.getBase();
        double altura = read.getAltura();
        double total = (base + altura) * 2;
        System.out.println("The perimeter is : " + total);
        return total;
    }

    public double dibujarRectangulo() {
        double base = read.getBase();
        double altura = read.getAltura();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        double total = altura * base;
        return total;
    }

}
