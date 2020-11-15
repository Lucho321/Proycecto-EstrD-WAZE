/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waze;

/**
 *
 * @author Luis
 */
public class Vertice {
    private String nombre;
    private int numVertice;
    
    Vertice(){
    }
    
    Vertice(String nom){
        nombre=nom;
        numVertice=-1;
    }
    
    public Vertice(String nombre, int numVertice){
        this.nombre=nombre;
        this.numVertice=numVertice;
    }
    
    
    public String getNombreVertice(){
        return nombre;
    }
    public void setNombreVertice(String nombre){
        this.nombre=nombre; 
    }
    public int getNumVertice(){
        return numVertice;
    }
    public void setNumVertice(int numVertice){
        this.numVertice=numVertice;
    }
    
    public boolean isIgual(Vertice n){
        return nombre == n.nombre;
    }
    
}
