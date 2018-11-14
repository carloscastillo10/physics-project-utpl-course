/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class TiempoOperaciones extends UnidadesTiempo {

    Scanner entrada = new Scanner(System.in);
    double n;

    public TiempoOperaciones() {
        super();
    }

    public void tiempo_dias() {

        System.out.print("\t---\n\tIngrese tiempo en Dias: ");
        agregar_dias(entrada.nextDouble());
        n = obtener_dias() * 86400;
        agregar_horas(obtener_dias() * 24);
        agregar_minutos(obtener_horas() * 60);
        agregar_segundos(n);
    }

    public void tiempo_horas() {
        System.out.print("\t---\n\tIngrese tiempo en Horas: ");
        agregar_horas(entrada.nextDouble());
        agregar_segundos(obtener_horas() * 3600);
        agregar_dias(obtener_segundos() / 86400);
        agregar_minutos(obtener_horas() * 60);

    }

    public void tiempo_minutos() {
        System.out.print("\t---\n\tIngrese tiempo en Minutos: ");
        agregar_minutos(entrada.nextDouble());
        agregar_segundos(obtener_minutos() * 60);
        agregar_dias(obtener_segundos() / 86400);
        agregar_horas(obtener_minutos() / 60);
    }

    public void tiempo_segundos() {
        System.out.print("\t---\n\tIngrese tiempo en segundos: ");
        agregar_segundos(entrada.nextDouble());
        agregar_dias(obtener_segundos() / 86400);
        agregar_horas(obtener_segundos() / 3600);
        agregar_minutos(obtener_segundos() / 60);
      
    }
    
    public int menu(){
        int opcion;
        System.out.printf(" \t __________________________________________________\n"
                + "\t%-51s|\n\t%-19s%-32s|\n\t%-51s|\n\t%-10s%-41s|\n\t%-10s%-41s|\n\t%-10s%"
                + "-41s|\n\t%-10s%-41s|\n\t%-10s%-41s|\n\t"
                + "|__________________________________________________|\n",
                "|", "|", "UNIDAD DE TIEMPO","|","|","1. Ingresar tiempo en Dias","|"
                ,"2. Ingresar tiempo en Horas","|","3. Ingresar tiempo en Minutos"
                ,"|","4. Ingresar tiempo en Segundos","|","5. <-- Regresar");
            System.out.printf("\n\tEscoja una opción: ");
            opcion = entrada.nextInt();
            return opcion;
    }

    @Override
    public String toString() {
        return String.format("\t---\n\tConversion\n\t---\n\tDias: %f\n\tHoras: %.2f\n"
                + "\tMinutos: %.2f\n\tSegundos: %.2f\n\t---\n",
                obtener_dias(), obtener_horas(), obtener_minutos(), obtener_segundos());
    }
}
