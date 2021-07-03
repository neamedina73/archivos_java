/* PROGRAMA QUE PASA UN CARACTER A CÓDIGO ASCII*/
import java.util.Scanner;
public class Precioproducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII");
        char caracter = sc.next().charAt(0);
        //Pasamos el caracter a código
        int codigo = (int) caracter;
        System.out.println(codigo);
    }
}
