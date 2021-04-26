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
public class Institucion {
    private String nombre;
    private String tipoInstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    //Metodos Establecer:
    public void establecerNombre(String f){
        nombre = f;
    }
    public void establecerTipoInstituto(String f){
        tipoInstitucion =f;
    }
    public void establecerNumAlumnos(int f){
        numAlumnos = f;
    }
    public void establecerNumDocentes(int f){
        numDocentes = f;
    }
    public void establecerNumSedes(int f){
        numSedes = f;
    }
    //Metodos Obtener:
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerTipoInstituto(){
        return tipoInstitucion;
    }
    public int ObtenerNumAlumnos(){
        return numAlumnos;
    }
    public int ObtenerNumDocentes(){
        return numDocentes;
    }
    public int ObtenerNumSedes(){
        return numSedes;
    }
    
}