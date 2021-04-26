/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.EquivalenteHora;

/**
 *
 * @author nixon
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de objetos
        EquivalenteHora h1 = new EquivalenteHora();
        EquivalenteHora h2 = new EquivalenteHora();
        //Primer objeto
        h1.establecerHoras(2);
        h1.calcularMinutos();
        h1.calcularSegundos();
        h1.calcularDias();
        //Segundo objeto
        h2.establecerHoras(48);
        h2.calcularMinutos();
        h2.calcularSegundos();
        h2.calcularDias();
        System.out.printf("La cantidad de %d hora o horas tiene:\n"
                + "%d minutos\n"
                + "%d segundos\n"
                + "%d dias\n",
                 h1.obtenerHoras(), h1.obtenerCalcularMinutos(),
                h1.obtenerCalcularSegundos(), h1.obtenerCalcularDias());
        System.out.println("==================================");
        System.out.printf("La cantidad de %d hora o horas tiene:\n"
                + "%d minutos\n"
                + "%d segundos\n"
                + "%d dias\n",
                 h2.obtenerHoras(), h2.obtenerCalcularMinutos(),
                h2.obtenerCalcularSegundos(), h2.obtenerCalcularDias());
        System.out.println("==================================");
    }
}
