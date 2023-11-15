/*
*   Generar un programa que permita ingresar un nombre de una ciudad;
*   Los nombres de las ciudades permitidas son las que empiezan con vocal.
*   Si la ciudad es permitida presentar un mensaje:
*   Nombre con inicial O de otavalo
*   Si la ciudad no es permitida presentar un mensaje:
*   opción incorrecta; ninguna de las anteriores
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int edad;
        String nombre;
        String apellido;
        String universidad;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();

        System.out.println("Ingrese su Universidad");
        universidad = entrada.nextLine();

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();

        char valor = nombre.charAt(0);

        switch (valor) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.printf(" %s %s con edad de %d es estudiante de %s", nombre.toUpperCase(),
                        apellido.toUpperCase(),
                        edad, universidad);

                break;

            default:
                System.out.printf(" %s %s con edad de %d es estudiante de %s", nombre.toLowerCase(),
                        apellido.toLowerCase(),
                        edad, universidad);
        }

    }
}
