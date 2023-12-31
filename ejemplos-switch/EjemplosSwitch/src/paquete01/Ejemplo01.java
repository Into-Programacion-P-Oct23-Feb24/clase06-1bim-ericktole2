/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();

        switch (cadena) {
            case "Lunes":
            case "LUNES":
            case "lunes":
                System.out.printf("%s\n Es el primer dia de la "
                        + "semana ", cadena);
                break;

            case "Martes":
            case "martes":
                System.out.printf("%s\n Es el segundo dia de "
                        + "la semana ", cadena);
                break;

            case "Miercoles":
            case "MIERCOLES":
            case "miercoles":
                System.out.printf("%s\n Es el tercer dia de la"
                        + " semana", cadena);
                break;

            case "Jueves":
            case "jueves":
            case "JUEVES":
                System.out.printf("%s\n Es el cuarto dia de la "
                        + "semana", cadena);
                break;

            case "Viernes":
            case "VIERNES":
            case "viernes":
                System.out.printf("%s\n Es el quinto dia de la "
                        + "semana", cadena);
                break;

            case "SABADO":
            case "sabado":
            case "Sabado":
                System.out.printf("%s\n Es el sexto da de la "
                        + "semana", cadena);
                break;

            case "Domingo":
            case "DOMINGO":
            case "domingo":
                System.out.printf("%s\n Es el serptimo dia "
                        + "de la semana ", cadena);
                break;

            default:
                System.out.println("ninguna de las anteriores");
                break;
        }

    }
}
