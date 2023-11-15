/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase()); 
        // .toLowerCase es un metodo para volver una variable en letras minusculas
        System.out.printf("%s\n", ciudad.toUpperCase());
        // .toUpperCase es un metodo para volver una variable en letras mayuscula
        System.out.printf("%s\n", ciudad);
        
        
    }
}
