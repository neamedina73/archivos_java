/*Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000. Realizado por Nelson Acuña Medina*/
import java.util.Scanner;
public class sueldo_Trabajador {
    public static void main(String[] args) {
        Scanner horasExt = new Scanner(System.in);
        int salario_base = 982523, sueldo_Total, valor_hrasExt, cant_hrasExt;
        System.out.print("Ingrese la cantidad de horas extras del mes: ");
        cant_hrasExt = horasExt.nextInt();
        valor_hrasExt = (cant_hrasExt * 30000);
        sueldo_Total = (salario_base + valor_hrasExt);
        System.out.println("                                              ");
        System.out.println("           N  O  M  I  N  A                \n");
        System.out.println("==============================================");
        System.out.println("El salario base es: $ "+salario_base);
        System.out.println("Las horas extras laboradas fueron: "+cant_hrasExt+" horas.");
        System.out.println("El valor de las horas extras es:  $ "+valor_hrasExt);
        System.out.println("______________________________________________");
        System.out.println("Total a pagar al trabajador:  $ " +sueldo_Total);
        System.out.println("==============================================");
        horasExt.close();
    }
}
