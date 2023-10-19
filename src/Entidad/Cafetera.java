/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author duran
 */
public class Cafetera {
    int capa_max;
    int cant_act;

    public Cafetera(int capa_max, int cant_act) {
        this.capa_max = capa_max;
        this.cant_act = cant_act;
    }

    public Cafetera(){}
    
    //setters

    public void setCapa_max(int capa_max) {
        this.capa_max = capa_max;
    }

    public void setCant_act(int cant_act) {
        this.cant_act = cant_act;
    }
    
    //getters

    public int getCapa_max() {
        return capa_max;
    }

    public int getCant_act() {
        return cant_act;
    }
    
    
    
    
}
