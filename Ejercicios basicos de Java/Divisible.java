/* Programa que indica si un número es divisible entre 2. */
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero=sc.nextInt();
        //Comprobamos si es divisible entre dos, es decir, si el resto de la división es 0.
        if (numero%2==0){
            System.out.println("El número "+numero+" es divisible entre 2");
        }
        else{
            System.out.println("El número "+numero+" no es divisible entre 2");
        } 
        sc.close(); 
    }
}
