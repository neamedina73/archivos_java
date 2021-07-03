/* Pedir una calificación de 0 a 5*/
import java.util.Scanner;//libreria scanner
public class Calificacion {
    private static float nogit ta;

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduduce una nota de 0 a 5.0:");
        var nota = sc.nextFloat();
		sc.close();
        //tanto los if's como los else's encierran a una sola isntrucción
        // y no es necesario utilizar llaves
        if(nota >= 0 & nota<=2.8)
		System.out.println("INSUFICIENTE");
		else
		if(nota>=3.0 & nota<=3.4)
		System.out.println("SUFICIENTE");
		else
		if(nota>=3.5 & nota<=4.0)
		System.out.println("BIEN");
		else
		if(nota>=4.1 & nota<=4.4)
		System.out.println("NOTABLE");
		else
		if(nota>=4.5 & nota<=5.0 )
		System.out.println("SOBRESALIENTE");
    }

	public static float getNota() {
		return nota;
	}

	public static void setNota(float nota) {
		Calificacion.nota = nota;
	}
}
