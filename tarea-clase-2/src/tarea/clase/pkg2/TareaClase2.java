/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author isral
 */
public class TareaClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Precio p = new Precio();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numerito");
        p.agregar(entrada.nextInt());
        System.out.println(p.obtener());
    }
    
}
