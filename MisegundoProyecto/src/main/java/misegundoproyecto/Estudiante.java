/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misegundoproyecto;

/**
 *
 * @author Nelson Acuña Medina
 */
//primera clase
public class Estudiante extends Persona {
    private String carrera;
    private int legajo;
    //Cosntructor
    public Estudiante(){
    }
    public String getCarrera(){
        return carrera;
    } 
    public void setCarrera(String val){
        this.carrera = val;
    }
    public int getLegajo(){
        return legajo;
    }
    public void setLegajo(int val){
        this.legajo = val;
    }
}
