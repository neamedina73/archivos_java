/* Programa que indica si un número es múltiplo de 10. 
Elaborado por Nelson Acuña Medina*/
import java.util.Scanner;

public class num_Mult_de10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero=sc.nextInt();
        //Comprobamos si el numero ingresao es multiplo de 10.
        if (numero%10==0){
            System.out.println("El número "+numero+" es multiplo de 10");
        }
        else{
            System.out.println("El número "+numero+" no es multiplo de 10");
        } 
        sc.close(); 
    }
}
