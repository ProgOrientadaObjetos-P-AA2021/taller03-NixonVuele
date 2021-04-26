/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author nixon
 */
public class EquivalenteHora {

    private int horas;
    private int minutos;
    private int segundos;
    private int dias;

    //Metodos Establecer:
    public void establecerHoras(int f) {
        horas = f;
    }

    public void calcularMinutos() {
        minutos = 60 * horas;
    }

    public void calcularSegundos() {
        segundos = 3600 * horas;
    }

    public void calcularDias() {
        dias = horas / 24;
    }

    //Metodos Obtener:
    public int obtenerHoras() {
        return horas;
    }

    public int obtenerCalcularMinutos() {
        return minutos;
    }

    public int obtenerCalcularSegundos() {
        return segundos;
    }

    public int obtenerCalcularDias() {
        return dias;
    }
}
