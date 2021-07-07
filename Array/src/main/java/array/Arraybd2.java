/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Alejandro AJ
 */
public class Arraybd2 {
    public static void main(String[] args)
    throws InterruptedException {
        
        int [][] num = new int[3][2]; //array de 3 filas por 2 columnas
        
        num[0][0] = 46;
        num[1][0] = 52;
        num[1][1] = 81;
        num[2][1] = 9;
        
        int fila;
        int columna;
        
        for (fila = 0; fila <3; fila++){
            System.out.print("Fila: "+fila);
            
            for (columna = 0; columna < 2;  columna++){
                System.out.printf("%10d", num[fila][columna]);
                Thread.sleep(1000);//retador de un segundo
            }
            System.out.println();
        }
    }
}


