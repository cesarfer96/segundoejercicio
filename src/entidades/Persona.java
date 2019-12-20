/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jherom Chacon
 */
public class Persona {
    // Se hace la variable public para que se pueda usar en el main
    public String nombre;
           String apellido;
           int edad;
           // Se crea la variable sexo, ya que en el main, la utilizaba y no estaba creada
           String sexo;
           
    // Se hace el set y get de sexo, para poder llamarla en el main
    public  void setSexo(String sexo){}
    public  String getSexo(){
        return this.sexo;
    } 
    
}
