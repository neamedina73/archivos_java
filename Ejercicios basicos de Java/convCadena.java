/*Convierte cadena de caracteres.
programa elaborado por Nelson Acuña Medina*/

public class convCadena {
    public static void main(String[] args) {
        String str_Sample = "Un ejemplo";   
        // Devuelve Carácter en la posición.      
        System.out.println("Índice de caracter 'U':" + str_Sample.indexOf('U')); 
        String minuscula = new String("NELSON");       
        // convierte la cadena NELSON a minúscula     
        System.out.println(minuscula.toLowerCase());
        // convierte la cadena colombia a Mayúscula 
        String mayuscula = new String("colombia");       
        System.out.println(mayuscula.toUpperCase());
       //  Longitud de la cadena Colombia 
        String palabra = "Colombia";       
        int longitud = palabra.length();       
        System.out.println("Longitud de la cadena Colombia es:" + palabra.length());   
    }
}
