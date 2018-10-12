/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck3;



/**
 *
 * @author isral
 */
public class Precio {
    private double euros; 
    private double esda; 
    private double as; 



    
    public double obtener(){
        return euros;
        
    }
    public void agregar(double x){
        euros = x;
    }
    public Precio(){
        agregar(30.2);
    }
}
