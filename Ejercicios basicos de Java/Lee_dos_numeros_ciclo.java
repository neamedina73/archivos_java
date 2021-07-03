import java.util.Scanner;
public class Lee_dos_numeros_ciclo{
    public static void main(String[] args) {
        
        Scanner leernumero = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        do{
            System.out.println("Ingrese el número 1: ");
            numero1 = leernumero.nextInt();
            System.out.println("Ingrese el número 2: ");
            numero2 = leernumero.nextInt();
        }while(numero1!=numero2);
        System.out.println("Has terminado, los números son iguales");
        leernumero.close();
    }
}