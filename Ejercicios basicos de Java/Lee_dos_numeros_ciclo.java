import java.util.Scanner;
public class Lee_dos_numeros_ciclo{
    public static void main(String[] args) {
        
        Scanner leernumero = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        do{
            System.out.println("Ingrese el número 1: ");
            num1 = leernumero.nextInt();
            System.out.println("Ingrese el número 2: ");
            num2 = leernumero.nextInt();
        }while(num1!=num2);
        System.out.println("Has terminado, los números son iguales, el "+num1+ " es igual a " +num2);
        leernumero.close();
    }
}