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
public class SegundoEjercicio {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
    String marca;
    int seleccion;
    String origen = null;
    int autos =  0;
    double costo;
    double impuesto = 0;
    double precio_venta = 0;
    int total_autos = 0;
    double total_impuesto = 0;
    double total_pv = 0;
    int argentina = 0;
    int chile = 0;
    int colombia = 0;
    int resto_mun = 0;
    String reporte = "";
    boolean bandera = true;
    reporte = String.format("\t\t%s\n%s\t%s\t%s\t%s\t%s\n","Reporte de Autos Importados", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");
    while (bandera){
    System.out.println("Ingrese la marca del automovil: ");
    marca = entrada.nextLine();
    System.out.println("Ingrese el origen del automovil:\nDigite:\n1. Argentina\n2. Chile\n 3. Colombia\n4. Resto del mundo ");
    seleccion = entrada.nextInt();
    
          switch (seleccion) {
            case 1:
                argentina = argentina + 1;
                impuesto = 0.20;
                origen = "Argentina";
                break;
            case 2:
                chile = chile + 1;
                impuesto = 0.30;
                origen = "Chile";
                break;
            case 3:
                colombia = colombia + 1;
                impuesto = 0.25;
                origen = "Colombia";
                break;
            case 4:
                resto_mun = resto_mun + 1;
                impuesto = 0.40;
                origen = "Resto del mundo";
                break;
            }
    
    System.out.println("Ingrese el costo del automovil: ");
    costo = entrada.nextInt();
    
    impuesto = impuesto * costo;
    precio_venta = costo + impuesto;
    entrada.nextLine();
            
            System.out.println("¿Desea añadir otro Automovil?");
            String temporal = entrada.nextLine();
            if(temporal.equals("no")){
                bandera = false;    
        }
    autos = autos + 1;
    total_impuesto = total_impuesto + impuesto;
    total_pv = total_pv + precio_venta;
    reporte = String.format("%s%s\t%s\t%.2f\t%.2f\t%.2f\n", reporte, marca, origen , costo, impuesto, precio_venta);
    }
    
    reporte = String.format("%s%s\t%d\t\t%s%f\t%s%f\n%s\t%d\n%s\t%d\n%s\t%d\n%s\t%d",reporte, "Total Autos: ", autos, "Tot. Imp: ", total_impuesto, "Tot.Pv: ", total_pv,"Argentina", argentina
    , "Chile", chile, "Colombia", colombia, "Resto del mundo", resto_mun);
    System.out.printf("%s",reporte);
    }

}


