//Hallar el área de una circunferencia
import java.util.*;
public class Longitud_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, longitud, area, area2;
        System.out.println("Introduzca el radio de la circunferencia:");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        area2 = 3.1416 * (radio*radio);
        System.out.println("La longitude de la circunferencia es ->"+longitud);
        System.out.println("El área de la circunferecnia es ->"+area);
        System.out.println("El área de la circunferecnia  dos es ->"+area2);
    } 
}
