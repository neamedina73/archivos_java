import java.util.*;
public class ConvertirC_Fh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double gradosC, gradosF;
        System.out.println("Introduce grados centígrados: ");
        gradosC = sc.nextDouble();
        gradosF =  32 + (9 * gradosC/5);
        System.out.println("De grados centrígados "+gradosC+"a grados Farenheit es: " +gradosF);

    }
}
