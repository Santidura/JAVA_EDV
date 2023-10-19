/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.user;
import java.util.Scanner;

/**
 *
 * @author duran
 */
public class service_user {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    user users = new user();
    
    
    public void cargarUsuario(){
        
     System.out.println("Este programa lamacena los usuarios y los muestra "); 
        System.out.println("Ingresa el id: ");
        int id=leer.nextInt();
        users.setId(id);
        System.out.println("Ingresa el nombre: ");
        String name=leer.next();
        users.setName(name);
        System.out.println("Ingresa ls direccion de correo: ");
        String address= leer.next();
        users.setAddress(address);
        System.out.println("Ingresa el numero telefonico: ");
        int phone = leer.nextInt();
        users.setPhone(phone);
        
        
}
    public void mostrarusuario(){
        System.out.println("EL id del usuario es: " + users.getId());
        System.out.println("El nombre del usuario es: " + users.getName());
        System.out.println("La direccion de corre es: " + users.getAddress());
        System.out.println("El telefno del usuario es : "+ users.getPhone());
        
    }
    
    
}
