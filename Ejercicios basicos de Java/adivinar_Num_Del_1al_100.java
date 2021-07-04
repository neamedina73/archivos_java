/*Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio. Elaborado por Nelson Acuña Medina*/

import java.util.Scanner;
public class adivinar_Num_Del_1al_100 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numero, i, num_aleat = (int) ((Math.random()*100)+1);//genera numeros aleatorios del 1 al 100.
        //número que pide el programa.
        System.out.println("Averiguar un número de 100 posibilidades");
        System.out.println("Tienes cinco posibilidadaes, por favor ingresa un número entre 1 y 100:");
        numero = num.nextInt();
        for (i=0; i<=4; i++){
            //Se verifica si acertó o no.
            if (num_aleat==numero){
                System.out.println("¡Felicitaciones, has acertado!");
                break;
            }
            else if (i == 4){
                System.out.println("¡Has Perdido!, el número era el: " +num_aleat);
                break;
            }
            //Se comparan los dos números.
            else if (num_aleat > numero)
            System.out.println("El número oculto es Mayor que: " +numero);
            else if (num_aleat < numero)
            System.out.println("El número oculto es Menor que: " +numero);
            //Dar pistas y aviso de última oportunidad.
            if (i <= 1 ){
                System.out.println("Tienes otro intento:");
                numero = num.nextInt();}
            else if (i==2){
                int x = (int) (num_aleat/10);
                System.out.println("Regalo una pista, la primera cifra es: "+x);
                System.out.println("Vuelve a intentarlo: ");
                numero = num.nextInt();}
                else if (i>=3){
                    System.out.println("Peligro, último intento!: ");
                    numero = num.nextInt();}
                }
            num.close(); 
    }
}

