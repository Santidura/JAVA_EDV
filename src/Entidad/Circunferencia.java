/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author duran
 */
// cracion de los objetos radio y perimetro
public class Circunferencia {

    private double radio, area, perimetro;
    public double getRadio;

    //inicio constructor
    public Circunferencia(double radio) {
        this.radio = radio;

    }//fin constructor

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Circunferencia() {
    }

    //inicio get y set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //finaliza get y set

}
