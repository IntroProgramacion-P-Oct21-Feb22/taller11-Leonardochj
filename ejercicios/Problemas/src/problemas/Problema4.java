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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 1 calcular el área al cuadrado. "
                + "Ingrese 2 para calcular el valor de la luz.");
        int tipo = entrada.nextInt();
        if (tipo == 1){
            calcularValorLuz();
        } else {
            if (tipo == 2) {
                calcularPredio();
            } else {
                System.out.println("Error");
            }

        }
        
    }
    public static void calcularValorLuz() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "";
        String nombreCliente;
        int cedula;
        double valorKilovatios;
        int numeroKilovatios;
        double valorTotal;
        System.out.println("Ingrese el nombre del cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese la cedula del cliente");
        cedula = entrada.nextInt();
        System.out.println("Ingrese el valor del kilovatio");
        valorKilovatios = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios al mes");
        numeroKilovatios = entrada.nextInt();
        valorTotal = valorKilovatios*numeroKilovatios;
        cadena = String.format("%sCliente %s con cedula %d debe cancelar el "
                + "valor de %.2f\n", cadena, nombreCliente, cedula, valorTotal);
        System.out.printf("%s\n", cadena);
    }

    public static void calcularPredio() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "";
        String nombreCliente;
        int cedula;
        double valorPredio;
        double valorInmueble;
        System.out.println("Ingrese el nombre del cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese la cedula del cliente");
        cedula = entrada.nextInt();
        System.out.println("Ingrese el valor del inmueble");
        valorInmueble = entrada.nextDouble();
        valorPredio = ((valorInmueble)*2)/100;
        cadena = String.format("%sCliente %s con cedula %d tiene un bien "
                + "inmueble valorado en %.2f tiene que pagar de predio %.2f", 
                cadena, nombreCliente, cedula, valorInmueble, valorPredio);
        System.out.printf("%s\n", cadena);
    }

}
