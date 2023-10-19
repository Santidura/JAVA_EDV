/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author duran
 */
public class service_cafetera {
    
    Scanner read = new Scanner(System.in);
    Cafetera book = new Cafetera();
    
    
    
    
    public int ingresarCant(){
        System.out.println("Esto va a almacenquear la cantidad maxima ");
        System.out.println("que una cafetera puede tener llena de cafe ");
        System.out.println("Ingrese la cantidad actual de cafe:  ");
        int cant_act = read.nextInt();
        book.setCant_act(cant_act);
        System.out.println("Ingrese la cantidad maxima de cafe:  ");
        int capa_max = read.nextInt();
        book.setCapa_max(capa_max);
        System.out.println("La capacidad que tienes actualmente es:" +cant_act );
        System.out.println("La cantidad maxima que es:"+capa_max );
        if (capa_max<cant_act){
            System.out.println("Se rego el tinto ");
        }else{
            System.out.println("Bien papi ya puedes hacer cafe ");
        };
        int total=cant_act-capa_max;
        return total;
    }
    
}
