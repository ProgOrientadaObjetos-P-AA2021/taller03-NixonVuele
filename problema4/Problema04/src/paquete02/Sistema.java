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
public class Sistema {

    private String sistemaOperativo;
    private String pantalla;
    private double costo;
    private String direccionMac;
    private String informacionImei;

    //Metodos Establecer:
    public void establecerSistemaOperativo(String f) {
        sistemaOperativo = f;
    }

    public void establecerPantalla(String f) {
        pantalla = f;
    }

    public void establecerCosto(double f) {
        costo = f;
    }

    public void establecerDireccionMac(String f) {
        direccionMac = f;
    }

    public void establecerInformacionImei(String f) {
        informacionImei = f;
    }

    //Metodos Obtener:
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public String obtenerPantalla() {
        return pantalla;
    }

    public double ObtenerCosto() {
        return costo;
    }

    public String ObtenerDireccionMac() {
        return direccionMac;
    }

    public String ObtenerInformacionImei() {
        return informacionImei;
    }

}
