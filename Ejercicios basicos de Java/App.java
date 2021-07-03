import java.util.Scanner; //Importa la clase Scanner
public class App {
    public static void main(String[] args){
        System.out.println("Hola Mundo");
        
        var sc= new Scanner (System.in);
        System.out.println("Ingrese su nombre:");
        var nombre = sc.nextLine();
        System.out.println("Hola " +nombre+ "!");
        sc.close();
    }

}
