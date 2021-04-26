/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.Sistema;

/**
 *
 * @author nixon
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea el objeto i1 y i2 (objetos)
        Sistema s1 = new Sistema();
        Sistema s2 = new Sistema();
        System.out.println("Objeto 1:");
        s1.establecerSistemaOperativo("Android");
        s1.establecerPantalla("800x1200");
        s1.establecerCosto(578.34);
        s1.establecerDireccionMac("EC-5C-68-80-4F-26");
        s1.establecerInformacionImei("010928/00/389023/3");
        System.out.printf("El sistema operativo es: %s\n"
                + "El tamaño de la pantalla es de: %s\n"
                + "El costo del dispositivo es de: %.2f$\n"
                + "La direccion MAC es: %s\n"
                + "La informacion IMEI es: %s\n",
                s1.obtenerSistemaOperativo(), s1.obtenerPantalla(),
                s1.ObtenerCosto(), s1.ObtenerDireccionMac(),
                s1.ObtenerInformacionImei());
        //objeto2:
        System.out.println("\nObjeto 2:");
        s2.establecerSistemaOperativo("iOS");
        s2.establecerPantalla("700x1000");
        s2.establecerCosto(987.25);
        s2.establecerDireccionMac("EF-5G-45-67-8G-54");
        s2.establecerInformacionImei("345728/01/459236/9");
        System.out.printf("El sistema operativo es: %s\n"
                + "El tamaño de la pantalla es de: %s\n"
                + "El costo del dispositivo es de: %.2f$\n"
                + "La direccion MAC es: %s\n"
                + "La informacion IMEI es: %s\n",
                s2.obtenerSistemaOperativo(), s2.obtenerPantalla(),
                s2.ObtenerCosto(), s2.ObtenerDireccionMac(),
                s2.ObtenerInformacionImei());
    }

}
