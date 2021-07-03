import java.util.Scanner;
public class promNotas {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        Scanner nombres = new Scanner(System.in);
        String nombre;
        float nota1, nota2, nota3, promedio;
        System.out.println("Ingrese sus nombres y apellidos: ");
        nombre = nombres.next();
        System.out.println("Ingrese la primera nota:");
        nota1 = notas.nextFloat();
        System.out.println("Ingrese la segunda nota:");
        nota2 = notas.nextFloat();
        System.out.println("Ingrese la tercera nota:");
        nota3 = notas.nextFloat();
        promedio = (nota1+nota2+nota3)/3;
        System.out.println("============================================================");
        if (promedio < 2.9){

            System.out.println("El alumno  "+nombre+"  tiene un promedio de:  " +promedio+ "  Reprobó el año.");
            System.out.println("Debe recuperar.");
            System.out.println("============================================================");
        }
        else{
            System.out.println("El alumno  "+nombre+"  tiene un promedio de:  " +promedio+ "  Aprobó el año.");
            System.out.println("F E L I C I T A C I O N E S.");
            System.out.println("============================================================");
        }
        notas.close();
        nombres.close();
    }
}
