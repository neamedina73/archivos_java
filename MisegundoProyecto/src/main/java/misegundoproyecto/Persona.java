/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misegundoproyecto;

/**
 *
 * @author Alejandro AJ
 */
public class Persona {
    private String nombre;
    private int edad;
    //constructor
    public Persona(){
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int val){
        this.edad = val;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String val){
        this.nombre = val;
    }
}
