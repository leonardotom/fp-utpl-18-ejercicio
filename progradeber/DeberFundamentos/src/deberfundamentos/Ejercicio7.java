/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberfundamentos;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Ejercicio7 {
    public static void main(String[] args) {
    double sueldo = 360.40 ;
    int ventas;
    double porcentaje;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el número de ventas: ");
    ventas = entrada.nextInt();
    
    if (ventas < 500 ){
        porcentaje = sueldo * 0.05;
        sueldo = sueldo + porcentaje;
    }
    if (ventas > 500 & ventas <= 1000){
        porcentaje = sueldo * 0.08;
        sueldo = sueldo + porcentaje;
    }
    if(ventas > 1000 & ventas <= 5000){
        porcentaje = sueldo * 0.10;
        sueldo = sueldo + porcentaje;
    }
    if(ventas > 5000){
        porcentaje = sueldo * 0.15;
        sueldo = sueldo + porcentaje;
    }
    System.out.printf("----------SUELDO EMPLEADO----------\nSueldo: %s\n",sueldo);
    
    }
}
