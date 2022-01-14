/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades;
        ciudades = obtenerCiudades();
        presentarCaracteres(ciudades);
    }
    public static String[] obtenerCiudades(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int indice;
        System.out.println("Ingresar el numero de elemntos del arreglo");
        indice = entrada.nextInt();
        entrada.nextLine();
        String[] ciudades = new String[indice];
        for(int i = 0; i < ciudades.length; i++){
            System.out.println("Ingrese ciudad del Ecuador");
            ciudades[i] = entrada.nextLine();
        }
        return ciudades;
    }
    public static void presentarCaracteres(String[] datos){
        String mensaje = "";
        for(int i = 0; i < datos.length; i++){
            if(datos[i].length() == 4 || datos[i].length() == 5)
                mensaje = String.format("%s%s\n", mensaje, datos[i]);
        }
        System.out.printf("La ciudades del Ecuador que tienen 4 o 5 caracteres "
                + "son:\n%s\n", mensaje);
    }
}