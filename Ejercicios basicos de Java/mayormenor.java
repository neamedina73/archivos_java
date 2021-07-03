/* Pide 2 números y muestra cual es el mayor, el menor, o si son iguales*/
import java.util.Scanner;

public class mayormenor {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1;
    int num2;
    System.out.println("Introduzca un número");
    num1=teclado.nextInt();
    System.out.println("Introduzca un número");
    num2=teclado.nextInt();
    if(num1==num2){
        System.out.println("Los números son iguales");
    }
    else if (num1>num2){
        System.out.println("El mayor es:"+num1);
    }
    else{
        System.out.println("El mayor es: "+num2);
    }
    }
}
