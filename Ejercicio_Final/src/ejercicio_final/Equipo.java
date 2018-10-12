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
public class Equipo {
    //Declaración de variables privadas tipo String
    private String nombre;
    private String num_jugadores;
    private String ciudad;
    
    //Metodos obtener para cada una de las variables
    public String obtener_Nombre() {
        return nombre;
    }

    public String obtenerNum_jugadores() {
        return num_jugadores;
    }

    public String obtener_Ciudad() {
        return ciudad;
    }
    
    //Metodos de agregar de cada variable, donde colacamos un parametro a cada una y lo alacenamos en su variable
    public void agregar_Nombre(String nom) {
        nombre = nom;
    }

    public void agregarNum_jugadores(String num_jug) {
        num_jugadores = num_jug;
    }

    public void agregar_Ciudad(String ciu) {
        ciudad = ciu;
    }
    
    //Primer constructor por defecto, se usara para el objeto 1
    public Equipo(){
        agregar_Nombre("Mel");
        agregarNum_jugadores("20");
        agregar_Ciudad("Guayaquil");
    }
    //Segundo constructor con un solo parametro, el cual  se usara para el objeto 2
    public Equipo(String  nombre){
        agregar_Nombre(nombre);
    }
    //Tercer constructor con dos parametros, el cual  se usara para el objeto 3
    public Equipo(String nombre, String num_jugadores){
        agregar_Nombre(nombre);
        agregarNum_jugadores(num_jugadores);
    }
    //Cuarto constructor con tres parametros, el cual  se usara para el objeto 4
    public Equipo(String nombre, String num_jugadores, String ciudad){
        agregar_Nombre(nombre);
        agregarNum_jugadores(num_jugadores);
        agregar_Ciudad(ciudad);
    }
}

