import java.util.*;
public class compraCliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int cantidad;
        System.out.println("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Digite la cantidad de producto");
        cantidad = entrada.nextInt();

        if (cantidad>0 && cantidad < 5){
            System.out.println("Pague en Efectivo");
        }
        else if (cantidad>=5 && cantidad<=12){
            System.out.println("Pague con Tarjeta");
        }
        else if (cantidad>=13){
            System.out.println("Error de Compra.");
        }
        entrada.close();
        }
}
