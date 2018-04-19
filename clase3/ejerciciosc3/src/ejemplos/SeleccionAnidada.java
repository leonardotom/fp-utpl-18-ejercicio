/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion

        int calificacion;
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese sus Nombres completos");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su calificación: ");
        calificacion = entrada.nextInt();

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.printf( nombre,"\n aprobado (excelente) con %d\n", calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("ESTUDIANTE: %s\n\t aprobado (muy buena)\n  con calificación de: %d\n",  nombre , calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("ESTUDIANTE: %S\n\t aprobado (regular)\n con calificación de:  %d\n",nombre, calificacion);

                } else {
                    System.out.printf(nombre, "\n Usted está reprobado con %d\n", calificacion);
                }
            }
        }
    }
}
