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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;
        int nueva_opcion = 0;
        TiempoOperaciones p = new TiempoOperaciones();

        while (opcion != 4) {
            System.out.printf(" __________________________________________________\n"
                    + "%-51s|\n%-19s%-32s|\n%-51s|\n%-10s%-41s|\n%-10s%-41s|\n%-10s%"
                    + "-41s|\n%-10s%-41s|\n"
                    + "|__________________________________________________|\n",
                    "|", "|", "MENU DE OPCIONES", "|", "|", "1. Tiempo", "|",
                     "2. Longitud", "|", "3. Masa", "|", "4. Salir");
            System.out.printf("\nEscoja una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:

                    while (nueva_opcion != 5) {
                        nueva_opcion = p.menu();

                        switch (nueva_opcion) {

                            case 1:
                                p.tiempo_dias();
                                System.out.println(p);
                                break;

                            case 2:
                                p.tiempo_horas();
                                System.out.println(p);
                                break;

                            case 3:
                                p.tiempo_minutos();
                                System.out.println(p);
                                break;

                            case 4:
                                p.tiempo_segundos();
                                System.out.println(p);
                                break;
                            case 5:
                                break;
                                
                            default:
                                System.out.printf("\nOPCION INCORRECTA\n");
                         

                        }
                        
                    }
                    break;
                
                case 4:
                    System.out.println("\nGRACIAS POR PREFERIRNOS\n");
                    break;
                
                default:
                    System.out.printf("\nOPCION INCORRECTA\n");
                    break;
            }
        }

    }

}
