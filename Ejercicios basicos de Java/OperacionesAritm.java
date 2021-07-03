/*Programa que realiza las 4 operaciones aritméticas de dos factores,
Elaborado por Nelson Acuña Medina.*/
import java.util.Scanner;
public class OperacionesAritm{
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        //Declaramos las variables
        int num1 = 0;
        int num2 = 0;
        System.out.println("Ingrese el primer número: ");
        num1 = numeros.nextInt();//captura los datos ingresados por teclado
        System.out.println("Ingrese el segundo número: ");
        num2 = numeros.nextInt();
        /*Realizamos las operaciones.
        * También podemos guardar los resultados en variables*/
        System.out.println("              RESULTADOS:                 ");
        System.out.println("=======================================");
        System.out.println("El resultado de la suma es: "+(num1+num2));
        System.out.println("El resultado de la resta es: "+(num1-num2));
        System.out.println("El resultado de la multilicación es: "+(num1*num2));
        System.out.println("El resultado de la división es: "+(num1/num2));
        System.out.println("=======================================");
        numeros.close();
        }
}