/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberfor;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class DeberFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        int asignaturas;
        String materia;
        double bim1;
        double bim2;
        double promedio = 0;
        String prom = "";
        String reporte = "Reporte calificaciones de estudiante\n";
        int contador;
        double promedio_tot = 0;
        boolean bandera = true;

        Scanner entrada = new Scanner(System.in);

        while (bandera) {
            System.out.println("Ingrese el Nombre del Estudiante: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese número de Asignaturas: ");
            asignaturas = entrada.nextInt();
            reporte = String.format("%s%s%s\n%s%d\n%s%d\n\n%s\n%s\t\t%s\t%s\t%s\n", reporte, "Nombre del Estudiante: ", nombre, "Edad: ", edad, "Número de Asignaturas: ", asignaturas, "Reporte de Notas.-", "Persona", "Bim-1", "Bim-2", "Promedio");
            
            entrada.nextLine();
            
            for (contador = 1; contador <= asignaturas; contador++) {
                System.out.printf("Ingrese el nombre de la materia %d: ", contador);
                materia = entrada.nextLine();
                System.out.printf("Ingrese calificación del primer bimestre de la materia %d: ", contador);
                bim1 = entrada.nextDouble();
                System.out.printf("Ingrese calificación del segundo bimestre de la materia %d: ", contador);
                bim2 = entrada.nextDouble();
                promedio = (bim1 + bim2) / 2;
                reporte = String.format("%s%s\t%.1f\t%.1f\t%.1f\n", reporte, materia, bim1, bim2, promedio);
                promedio_tot = promedio_tot + promedio;
                entrada.nextLine();
            }
            if (promedio_tot >= 19) {
                
                prom = "Sobresaliente";
            } else if (promedio_tot >= 16 & promedio_tot <= 19) {
                prom = "Muy Bueno";
            } else if (promedio_tot >= 13 & promedio_tot <= 16) {
                prom = "Bueno";
            } else if (promedio_tot < 13) {
                prom = "Regular";
            }

            reporte = String.format("%s\t\t%s\t%.1f\n\n%s%s%s\n", reporte, "Promedio", promedio, nombre, " tiene un promedio de: ", prom);

            System.out.println("¿Desea añadir otro reporte?");
            String temporal = entrada.nextLine();
            if (temporal.equals("no")) {
                bandera = false;
            }
            
        }
        System.out.printf("%s", reporte);
    }
}
