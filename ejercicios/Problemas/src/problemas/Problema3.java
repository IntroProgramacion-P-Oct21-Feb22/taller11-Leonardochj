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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor;
        String mensaje;
        valor = obtenerPromedio(10, 5, 8, 7);
        System.out.printf("El promedio es %.2f\n", valor);
        mensaje = obtenerPromedioCualitativo(valor);
        System.out.printf("%s\n", mensaje);
    }

    public static double obtenerPromedio(int a, int b, int c, int d) {
        double v;
        v = (a + b + c + d)/2;
        return v;
    }
    public static String obtenerPromedioCualitativo(double promedio){
        String promedioCualitativo = "";
        if (promedio >= 0 && promedio <= 5) {
            promedioCualitativo = "El promedio de 10, 5, 8 y 7 es Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                promedioCualitativo = "El promedio de 10, 5, 8 y 7 es Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    promedioCualitativo = "El promedio de 10, 5, 8 y 7 es muy bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        promedioCualitativo = "El promedio de 10, 5, 8 y 7 es Sobresaliente";
                    }
                }
            }
        }
            return promedioCualitativo;
    }
}
