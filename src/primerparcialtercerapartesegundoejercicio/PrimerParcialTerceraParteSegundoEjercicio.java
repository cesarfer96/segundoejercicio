/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialtercerapartesegundoejercicio;

import util.Utilidades;
import entidades.Persona;

/**
 *
 * @author Jherom Chacon
 */
public class PrimerParcialTerceraParteSegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Incio persona
        Persona persona = new Persona();
        persona.nombre = "Carlitos";
        //Agregar el valor del sexo 
        persona.setSexo("Masculino");
        //Fin de persona
        
        //Inicio Util
        int suma = Utilidades.suma(1,1);
        
        
//        int resultadoResta = Utilidades.resta(3,2);
        // Fin Util
        
    }
    
}
