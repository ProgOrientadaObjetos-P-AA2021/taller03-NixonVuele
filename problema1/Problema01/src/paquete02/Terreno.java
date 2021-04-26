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
public class Terreno {
    private double ancho;
    private double largo;
    private double metroCuadrado;
    private double area;
    private double costo;
    //Metodos Establecer:
    public void establecerAncho(double f){
        ancho = f;
    }
    public void establecerLargo(double f){
        largo =f;
    }
    public void establecerMetroCuadrado(double f){
        metroCuadrado = f;
    }
    public void calcularArea(){
        area = ancho * largo;
    }
    public void calcularCosto(){
        costo = metroCuadrado * area;
    }
    //Metodos Obtener:
    public double obtenerAncho(){
        return ancho;
    }
    public double obtenerLargo(){
        return largo;
    }
    public double obtenerMetroCuadrado(){
        return metroCuadrado;
    }
    public double obtenerCalcularArea(){
        return area;
    }
    public double obtenerCalcularCosto(){
        return costo;
    }
}
