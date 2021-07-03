/* Comprueba si un número es par o impar
Programa elaborado por Nelson Acuña Medina
*/
import java.util.Scanner;
public class PareImpar {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, ingrese un número entero: ");//Pide información por teclado
        numero = teclado.nextInt();//captura la información y la almacena en la variable numero
        teclado.close();
        if (numero%2==0)//condicón si el residuo es cero, 
        {
            System.out.println("El número  "+numero+" es par.");//el número es par.
        }
        else{
            System.out.println("El número "+numero+" es impar.");//si el residuo no es cero, el número es impar.
        }
    }
}
