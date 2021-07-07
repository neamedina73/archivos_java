/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitercerproyecto;

/**
 *
 * @author Alejandro AJ
 */
public class PruebaCronometro {
    public static void main (String[] args){
    int i,j,k;
    Cronometro t = new Cronometro();
    for (i=1; i<=10000; i++){
        for (j=1; j<=10000; j++ ){
            k=i+j;
        }
    } 
    System.out.println("Fin del bucle...");
    System.out.println("Tiempo =" +t.tiempoTranscurrido()+"mm");
}
}