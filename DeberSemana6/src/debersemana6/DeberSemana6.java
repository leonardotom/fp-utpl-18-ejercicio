/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debersemana6;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class DeberSemana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String articulo;
        String nombre;
        int cantidad;
        double precio_unitario;
        double precio_total;
        boolean bandera = true;
        int contador = 1;
        double subtotal = 0;
        double iva = 0.14;
        double total = 0; 
        String cadena_final = "";
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = entrada.nextLine();
        cadena_final = String.format("\t\t%s\n%s\n%s%s\n%s\t%s\t%s\t%s\n","Factura","Supermercado Todo a menor precio", "Nombre del cliente: ",nombre, "Artículo","Cantidad","Precio Unitario","Precio Total");
        while (bandera){
            System.out.printf("Ingrese nombre de Articulo %d\n", contador);
            articulo = entrada.nextLine();
            System.out.printf("Ingrese precio de Articulo %d\n", contador);
            precio_unitario = entrada.nextDouble();
            System.out.printf("Ingrese la cantidad de Articulos %d que desea adquirir\n", contador);
            cantidad = entrada.nextInt();
            precio_total = precio_unitario * cantidad;
            contador = contador + 1;
            cadena_final= String.format("%s%s\t\t%d\t\t%.2f\t\t\t%.2f\n",cadena_final, articulo, cantidad, precio_unitario, precio_total );
            subtotal = subtotal + precio_total;
            
            entrada.nextLine();
            
            System.out.println("¿Desea añadir otro articulo?");
            String temporal = entrada.nextLine();
            if(temporal.equals("no")){
                bandera = false;
            }
        }
        iva = subtotal*iva;
        total = subtotal + iva;
        cadena_final = String.format("%s\t\t\t\t%s\t%.2f\n\t\t\t\t%s\t%.2f\n\t\t\t\t%s\t%.2f",cadena_final,"Subtotal", subtotal,"Iva 14%", iva, "Total", total);
        System.out.printf("%s",cadena_final);
        
    }
    
}
