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
public class App {
    public static void main(String [] args){
        Persona p = new Persona();
        Estudiante e = new Estudiante();
        Profesor pro = new Profesor();
        
        p.setNombre("Nelson Enrique Acuña Medina");
        p.setEdad(48);
        
        e.setNombre("Yassel Alejandro Acuña Jimenez");
        e.setLegajo(13);
        e.setCarrera("Medicina");
        
        pro.setNombre("Merly Jimenez Hernandez");
        pro.setMateria("Fisiología II");
        pro.setCargo("Docente de planta");
        
        System.out.println("Vamos a imprimir el objeto \"p\" de la clase padre Persona");
        System.out.printf("Nombre: %s,  edad: %d \n", p.getNombre(), p.getEdad());
        System.out.println("Vamos a imprimir el objeto \"e\" de la clase hijo Estudiante");
        System.out.printf("\nNombre: %s, Carrera: %s, Legajo %d \n", e.getNombre(),e.getCarrera(), e.getLegajo());
        System.out.print("Vamos a imprimir el objeto\"e\" de la clase hijo Profesor: ");
        System.out.printf("\nNombre: %s, Materia: %s, Cargo: %s \n", pro.getNombre(), pro.getMateria(), pro.getCargo());
        
    }
    
}
