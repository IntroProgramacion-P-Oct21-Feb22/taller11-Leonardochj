/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {
   public static void main(String[] args) {
       int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
       double mediaAritmetica;
       double desviacionEstandar;
       mediaAritmetica = obtenerMediaAritmetica(informacion);
       System.out.printf("La media aritmética es %.2f\n", mediaAritmetica);
       desviacionEstandar = obtenerDesviacionEstandar(informacion, mediaAritmetica);
       System.out.printf("La desviación estándar es %.2f\n", desviacionEstandar);
   }
   public static double obtenerMediaAritmetica(int[] datos){
       double media = 0;
       for(int i = 0; i < datos.length; i++){
           media = (media + datos[i])/9;
       }
       return media;
   }
   public static double obtenerDesviacionEstandar(int[] datos, double x){
       double estandar = 0;
       for(int i = 0; i < datos.length; i++){
           estandar = (estandar + (datos[i]-x))/9-1;
       }
       return estandar;
   }
}
