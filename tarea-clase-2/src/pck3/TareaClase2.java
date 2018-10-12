/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck3;

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
        Precio p;
        //creacion de los objetos
        p = new Precio();
        Precio m = new Precio(2);
        Precio n = new Precio(255);
        //se presenta las cantidades
        System.out.println(p.obtener());
        System.out.println(m.obtener());
        System.out.println(n.obtener());
    }

}
