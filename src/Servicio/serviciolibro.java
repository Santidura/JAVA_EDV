
package Servicio;

import Entidad.libro;
import java.util.Scanner;

/**
 *
 * @author duran
 */
public class serviciolibro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    libro libro1 =new libro();  
    libro[] libros=new libro[10];
    
    
    
    public libro cargarlibro(){
        System.out.println("This program get the data book");
        System.out.println("Cuantos libors quieres crear:");
        libro1.setBook(leer.nextInt());
        libros = new libro[libro1.getBook()];
        
         for(int i = 0; i < libro1.getBook(); i++){
             
             libro nuevolibro = new libro();
            System.out.println("Numero del libro :" + (i+1));
            System.out.println("Insert the ISBC please: ");
            nuevolibro.setIsbc(leer.nextInt());
            System.out.println("Insert the book title ");
            nuevolibro.setTitulo(leer.next());
            System.out.println("Insert the author");
            nuevolibro.setAutor(leer.next());
            System.out.println("Insert the page num");
            nuevolibro.setNumpag(leer.nextInt());
            
                libros[i]=nuevolibro;
            
            
        }
        return null;
         
        
        
    
}
    
   

    public void mostrarlibro(){
        for (int i=0; i<libros.length; i++) {
            System.out.println("Libro:" + (i+1));
            System.out.println("ISBC: " + libros[i].getIsbc());
            System.out.println("Book title: " + libros[i].getTitulo());
            System.out.println("Author: " + libros[i].getAutor());
            System.out.println("Numpage: " + libros[i].getNumpag());
        }
        
    }

    
}


