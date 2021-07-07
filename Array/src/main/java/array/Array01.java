/*Arreglo unidimensional
* Conctribuye Luis Jose Sanchez
* Editado y actualizado por Nelson Acuña
*/
package array;

/**
 * @author Alejandro AJ
 */
public class Array01 {
    public static void main(String[] args){
        int[] num;//se define num como un array de enteros
        num = new int[4];//se reserva espacio para cuatro enteros
        
        num[0] = 236;
        num[1] = -35;
        num[2] = 104;
        num[3] =  7;
        
        System.out.println("Los valores del arreglo son los siguientes:");
        System.out.println(num[0]+","+num[1]+","+num[2]+","+num[3]);
        
        int suma = num[0] + num[3];
        int resta = num[2] - num[1];
        System.out.println("\nEl primer elemento del arreglo más el último suman " +suma);
        System.out.println("\nLa resta del tercer arreglo menos el segundo es: " +resta);
        
    }
}
