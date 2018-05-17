/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int persona;
        String nombre;
        double sueldo;
        double pasaje;
        int contador;
        double bar;
        double salida;
        double total_pasaje = 0;
        double total_bar = 0;
        double total_salida = 0;
        boolean bandera = true;
        double gasto_total = 0;
        String reporte = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el total de hijos: ");
        persona = entrada.nextInt();
        System.out.println("Ingrese el valor de su sueldo: ");
        sueldo = entrada.nextDouble();
        reporte = String.format("\t\t\t%s%.2f\n%s\n%s\t%s\t%s\t%s\n","Padre de familia gana: ", sueldo, "Padre de Familia:","Personas","Pasaje","Bar","Salidas");
        
        entrada.nextLine();
        
        for (contador =1; contador <= persona; contador ++){
          System.out.printf("Ingrese el nombre de hijo %d: ", contador);
          nombre = entrada.nextLine();
          System.out.printf("Ingrese el pasaje de hijo %d: ",contador);
          pasaje = entrada.nextDouble();
          System.out.printf("Ingrese el valor que gasta en bar el hijo %d: ", contador);
          bar = entrada.nextDouble();
          System.out.printf("Ingrese el valor que gasta por salida el hijo %d: ", contador);
          salida = entrada.nextDouble();
          reporte = String.format("%s%s\t%.2f\t%.2f\t%.2f\n", reporte, nombre, pasaje, bar, salida);
          total_pasaje = total_pasaje + pasaje;
          total_bar = total_bar + bar;
          total_salida = total_salida + salida;
          entrada.nextLine();
        }
        gasto_total = total_bar + total_pasaje + total_salida; 
        
        entrada.nextLine();
        
        
        if (gasto_total < sueldo){
            reporte = String.format("%s\n%s",reporte, "Al padre de familia le sobra dinero");
            }else{
            reporte = String.format("%s\n%s",reporte, "Al padre de familia le falta dinero");
        }
        System.out.printf("%s",reporte);
    }
}
