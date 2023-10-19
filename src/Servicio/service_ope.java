/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Operaciones;
import java.util.Scanner;

/**
 *
 * @author duran
 */
public class service_ope {

     Scanner read = new Scanner(System.in).useDelimiter("\n");
    Operaciones smrd = new Operaciones();

    public Operaciones crearOperaciones() {
        System.out.println("This is a program that calculate:smrd");
        System.out.println("Insert the fisrt number: ");
        int num1 = read.nextInt();
        smrd.setNum1(num1);
        System.out.println("Insert the second number : ");
        int num2 = read.nextInt();
        smrd.setNum2(num2);
        sumar();
        restar();
        mult();
        div();
        return null;
    }

    public int sumar() {
        int Num1 = (int) smrd.getNum1();
        int Num2 = (int) smrd.getNum2();
        int total = Num1 + Num2;
        System.out.println("The total of sum is: " +total );
        return total;
    }

    public int restar() {
        int Num1 = (int) smrd.getNum1();
        int Num2 = (int) smrd.getNum2();
        int total = Num1 - Num2;
        System.out.println("The total of rest is: "+total);
        return total;
    }

    public int mult() {
        int Num1 = (int) smrd.getNum1();
        int Num2 = (int) smrd.getNum2();
        int total = Num1 * Num2;
        System.out.println("The total of mult is: "+total);
        return total;
    }

    public int div() {
        int Num1 = (int) smrd.getNum1();
        int Num2 = (int) smrd.getNum2();
        int total = Num1 / Num2;
        System.out.println("The total of div is: "+total);
        return total;
    }

}
