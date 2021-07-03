/*Hallar el doble y el triple de un número entero
Programa elaborado por Nelson Acuña Medina*/

import java.util.Scanner;
public class Doble_Triple {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //se declara la variable
        int numero;
        //Pide información por teclado
        System.out.println("Ingrese un número entero:");
        //Captura la información y la guarda en la variable numero
        numero = teclado.nextInt();
        teclado.close();
        //Salida de información
        System.out.println("El número ingresado es: " + numero);
        System.out.println("El doble de " + numero + " es "+2*numero);
        System.out.println("El triple de " + numero + " es "+ 3*numero);
        System.out.println("======================================");
        System.out.println("Gracias por usar esta aplicación.");
        System.out.println("======================================");                             
    }
}
