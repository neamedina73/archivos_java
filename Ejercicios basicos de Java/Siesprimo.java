import java.util.Scanner;
public class Siesprimo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        boolean primo=true;
        int num;
        String respuesta, s, S;
        do{
            System.out.println("Introduzca un número: ");
            num = teclado.nextInt();
            for(int ind=2;ind<num;ind++){
                if(num%ind==0){
                    primo=false;
                }
            }
            if(primo==true){
                System.out.println("=======================");
                System.out.println(num+" es un número primo.");
            }
            System.out.println("Quieres introducir otro número? s/n");
            respuesta=teclado.next();
        }while(respuesta.equals("s") || respuesta.equals("S"));
    }
}
