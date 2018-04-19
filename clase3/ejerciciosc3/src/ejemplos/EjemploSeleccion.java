/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Crea una plicacion que permita ingresar una calificacion, y la calificacion 
ingresada es menor o igual a 5 y la calificacion es menor a 10 se debe presentar 
un mensaje que diga "Usted esta en supletorios", de lo contrario se presenta un mesaje
con el valor de la calificacion dividido para dos.
*/
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjemploSeleccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese su calificación: ");
        calificacion = entrada.nextDouble();
        
        //para python se una "and"
        if (calificacion >=5 & calificacion <10 ){
            System.out.printf("Usted está en supletorios");
        }else{
            double resultado = calificacion/2;
            System.out.printf("%f", resultado);
        }
    }
}
