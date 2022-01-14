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
public class Problema5 {
    public static void main(String[] args) {
    int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
    int valorTotal;
    valorTotal = obtenerSuma(informacion);
    System.out.printf("La suma del arreglo bidimensional es %d\n", valorTotal);
    }
    public static int obtenerSuma(int[][] datos){
        int suma = 0;
        for (int i = 0; i < datos.length; i++){
            for(int j = 0; j < datos[i].length; j++){
                suma = suma + datos[i][j];
            }
        }
        return suma;
    }
}
