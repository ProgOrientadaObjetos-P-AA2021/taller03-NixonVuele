/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.Institucion;
import java.util.Scanner;

/**
 *
 * @author nixon
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Se pide los datos al usuario
        System.out.println("Cual es la institucion en la que estudio?");
        String instituto= sc.nextLine();
        System.out.println("Cual es el tipo de institucion?");
        String tipoInstituto= sc.nextLine();
        System.out.println("Cuantos alumnos tiene la institucion?");
        int numAlumnos= sc.nextInt();
        System.out.println("Cuantos Docentes tiene la institucion?");
        int numDocentes= sc.nextInt();
        System.out.println("Cuantas Sedes tiene la institucion?");
        int numSedes= sc.nextInt();
        //Se crea el objeto i1 y i2 (objetos)
        Institucion i1 = new Institucion();
        Institucion i2 = new Institucion();
        i1.establecerNombre(instituto);
        i1.establecerTipoInstituto(tipoInstituto);
        i1.establecerNumAlumnos(numAlumnos);
        i1.establecerNumDocentes(numDocentes);
        i1.establecerNumSedes(numSedes);
        System.out.printf("\n//Objeto1-Datos Ingresados por el usuario:\n"
                + "El nombre del Instituto es: %s\n"
                + "El tipo de Instituto es: %s\nEl numero de Alumnos es: %d\n"
                + "El numero de docentes es: %d\nEl numero de Sedes es: %d\n", 
                i1.obtenerNombre(),i1.obtenerTipoInstituto(),
                i1.ObtenerNumAlumnos(),i1.ObtenerNumDocentes(),
                i1.ObtenerNumSedes());
        //objeto2:
        i2.establecerNombre("Señora del Rosario");
        i2.establecerTipoInstituto("Fiscomicional");
        i2.establecerNumAlumnos(1000);
        i2.establecerNumDocentes(50);
        i2.establecerNumSedes(3);
        System.out.printf("\nObjeto2-Datos predeterminados\n"
                + "El nombre del Instituto es: %s\n"
                + "El tipo de Instituto es: %s\nEl numero de Alumnos es: %d\n"
                + "El numero de docentes es: %d\nEl numero de Sedes es: %d\n", 
                i2.obtenerNombre(),i2.obtenerTipoInstituto(),
                i2.ObtenerNumAlumnos(),i2.ObtenerNumDocentes(),
                i2.ObtenerNumSedes());
    }

}