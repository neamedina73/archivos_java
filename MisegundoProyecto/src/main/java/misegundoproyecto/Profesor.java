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
public class Profesor extends Persona {
    private String materia;
    private String cargo;
    //cosntructor
    public Profesor(){
    }
    
    public String getMateria(){
    return materia;
    }
    
    public void setMateria(String val){
        this.materia = val;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String val){
        this.cargo = val;
    }
}
