/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.Terreno;

/**
 *
 * @author nixon
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de objects
        Terreno t1 = new Terreno();
        Terreno t2 = new Terreno();
        //Objeto 1:
        t1.establecerAncho(12.5);
        t1.establecerLargo(20.23);
        t1.establecerMetroCuadrado(15.34);
        t1.calcularArea();
        t1.calcularCosto();
        //Objeto2:
        t2.establecerAncho(13.23);
        t2.establecerLargo(35.12);
        t2.establecerMetroCuadrado(15.32);
        t2.calcularArea();
        t2.calcularCosto();
        System.out.printf("El costo total del primer terreno es de: %.2f$\n"
                + "Las dimensiones del primer terreno son:\n"
                + "Ancho: %.2fm\n"
                + "Largo: %.2fm\n"
                + "El area del terreno es: %.2fm\n"
                + "El costo por metro cuadrado es de: %.2f$\n",
                t1.obtenerCalcularCosto(), t1.obtenerAncho(), t1.obtenerLargo(),
                t1.obtenerCalcularArea(),t1.obtenerMetroCuadrado());
        System.out.println("==================================");
        System.out.printf("El costo total del segundo terreno es de: %.2f$\n"
                + "Las dimensiones del segundo terreno son:\n"
                + "Ancho: %.2fm\n"
                + "Largo: %.2fm\n"
                + "El area del terreno es: %.2fm\n"
                + "El costo por metro cuadrado es de: %.2f$\n",
                t2.obtenerCalcularCosto(), t2.obtenerAncho(), t2.obtenerLargo(),
                t2.obtenerCalcularArea(),t2.obtenerMetroCuadrado());
    }
}
