/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_final;

/**
 *
 * @author isral
 */
public class Ejercicio_Final {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Objeto y presentación por defecto usando el constructor sin parametros
        Equipo e = new Equipo();
        System.out.printf("Nombre: %.15s\t-\tJugadores: %.5s\t-\tCiudad: %s\n", e.obtener_Nombre(), e.obtenerNum_jugadores(), e.obtener_Ciudad());

        //Objeto y presentación del constructor con un parametro: Nombre del equipo
        Equipo e2 = new Equipo("Liga");
        e2.agregarNum_jugadores("32");
        e2.agregar_Ciudad("Quito");
        System.out.printf("Nombre: %.15s\t-\tJugadores: %.5s\t-\tCiudad: %s\n", e2.obtener_Nombre(), e2.obtenerNum_jugadores(), e2.obtener_Ciudad());

        //Objeto y presentación del constructor con dos parametros: Nombre del equipo - Número de jugadores
        Equipo e3 = new Equipo("Emelec", "19");
        e3.agregar_Ciudad("Guayas");
        System.out.printf("Nombre: %.15s\t-\tJugadores %.5s\t-\tCiudad: %s\n", e3.obtener_Nombre(), e3.obtenerNum_jugadores(), e3.obtener_Ciudad());

        //Objeto y presentación del constructor con tres parametros: Nombre del equipo - Número de jugadores - Ciudad
        Equipo e4 = new Equipo("Alianza", "25", "Manabi");
        System.out.printf("Nombre: %.15s\t-\tJugadores %.5s\t-\tCiudad: %s\n", e4.obtener_Nombre(), e4.obtenerNum_jugadores(), e4.obtener_Ciudad());

    }

}
