/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author duran
 */
public class libro {
    private int book;
    private int isbc;
    private String titulo;
    private String autor;
    private int numpag;

    public libro(int book,int isbc, String titulo, String autor, int numpag) {
        this.book = book;
        this.isbc = isbc;
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
    }
    
     public libro() {
        
        
        
    }
     

   //setters

    public void setBook(int book) {
        this.book = book;
    }

    public void setIsbc(int isbc) {
        this.isbc = isbc;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

   
   
     
   //getters

    public int getBook() {
        return book;
    }

    public int getIsbc() {
        return isbc;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumpag() {
        return numpag;
    }
    
}

