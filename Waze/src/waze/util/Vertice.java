/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waze.util;

import javafx.scene.shape.Circle;

/**
 *
 * @author Jeffry
 */
public class Vertice extends Circle{
    private int numero;
    
    public void setN(int n){
        numero = n;
    }
    
    public int getN(){
        return numero;
    }
}
