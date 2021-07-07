/**
* Clase Cronometro: muestra el uso de constructores
* Para medir el tiempo transcurrido entre la ultima llamada a
* ponerACero() y la llamada al metodo tiempoTranscurrido().
*/
package mitercerproyecto;

/**
 *
 * @author Alejandro AJ
 */
public class Cronometro {
    private double tiempo;
    
    //El constructor
    public Cronometro(){
            ponerACero();
}
//Metodo ponerACero
public void ponerACero(){
    tiempo = System.currentTimeMillis();//Método predefinido en java
}

//Método tiempoTranscurrido, devuelve el tiempo transcurrido en segundos.
public double tiempoTranscurrido(){
    double tt;
    tt = (System.currentTimeMillis()-tiempo)/1000;
    return tt;
}
}