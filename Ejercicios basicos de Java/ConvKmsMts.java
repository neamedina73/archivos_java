import java.util.Scanner;
public class ConvKmsMts {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double velocidad;
    System.out.println("Introduzca la velocidad en Km/h: ");
    velocidad = sc.nextDouble();
    System.out.println(velocidad + " Km/h, es convertido a -> " +velocidad*1000/3600 + " ms/s.");
    }
}
