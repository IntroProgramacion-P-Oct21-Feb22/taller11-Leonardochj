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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 1 calcular el área al cuadrado. "
                + "Ingrese 2 para calcular el área de un triángulo. "
                + "Ingrese 3 para calcular el área de un rectángulo");
        int tipo = entrada.nextInt();
        if (tipo == 1){
            obtenerAreaCuadrado();
        } else {
            if (tipo == 2) {
                obtenerAreaTriangulo();
            } else {
                if (tipo == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Error");
                }
            }

        }
        
    }
    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double areaCuadrado;
        String cadena = "";
        double ladoCuadrado;
        System.out.println("Ingrese lado del cuadrado");
        ladoCuadrado = entrada.nextDouble();
        areaCuadrado = ladoCuadrado*ladoCuadrado*ladoCuadrado*ladoCuadrado;
        cadena = String.format("%sEl area del cuadrado es: %.2f\n", cadena, 
                areaCuadrado);
        System.out.printf("%s\n", cadena);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double areaTriangulo;
        String cadena = "";
        double baseTriangulo;
        double alturaTriangulo;
        System.out.println("Ingrese la base del triangulo");
        baseTriangulo = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        alturaTriangulo = entrada.nextDouble();
        areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
        cadena = String.format("%sEl área del triángulo es %.2f\n", cadena, 
                areaTriangulo);
        System.out.printf("%s\n", cadena);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double areaRectangulo;
        String cadena = "";
        double baseRectangulo;
        double alturaRectangulo;
        System.out.println("Ingrese la base del rectangulo");
        baseRectangulo = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        alturaRectangulo = entrada.nextDouble();
        areaRectangulo = baseRectangulo*alturaRectangulo;
        cadena = String.format("%sEl área del rectángulo es %.2f\n", cadena, 
                areaRectangulo);
        System.out.printf("%s\n", cadena);
    }
}
