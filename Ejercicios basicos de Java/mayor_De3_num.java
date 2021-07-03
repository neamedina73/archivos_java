/*Programa que identifica el número mayor de tres ingresados por consola.
Elaborado por Nelson Acuña Medina*/
import java.util.Scanner;

public class mayor_De3_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaración de variables
        int num1, num2, num3;
        //Pide la información por teclado de tres números enteros
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();//captura la información y la almacena en la variable
        System.out.print("Ahora ingrese el segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Para terminar ingrese tercer número: ");
        num3 = sc.nextInt();
        //Condiciones
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El número mayor es: " + num1); //Imprime la información                                            
            } else {
                System.out.println("El número mayor es: " + num3); //Imprime la información     
            }
        } else if (num2 > num3) {
            System.out.println("El número mayor es: " + num2); //Imprime la información 
        } else {
            System.out.println("El número mayor es: " + num3); //Imprime la información 
        }
        sc.close();
    }
}