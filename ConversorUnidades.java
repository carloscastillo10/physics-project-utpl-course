package conversorunidades;

import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {

        float dias,hora,min,n,sec;

        System.out.println("======\nTiempo\n======");
        Scanner t = new Scanner(System.in);
        System.out.println("1.Dias\n2.Hora\n3.Minuto\n4.Segundo");
        System.out.print("---\nIngrese unidad a convertir: ");
        int op = t.nextInt();

        switch (op) {
            case 1: {
                System.out.print("---\nIngrese tiempo en Dias: ");
                dias = t.nextFloat();
                n = dias * 86400;
                hora = (float)dias * 24;
                min = (float) hora * 60;
                sec = (float) n;
                System.out.println("---\nConversion\n---");
                System.out.printf("Dias: %.2f\nHoras: %.2f\nMinuto: %.2f\nSegundo: %.2f\n---\n", dias,hora,min,sec);
            }
            break;
            case 2: {
                System.out.print("---\nIngrese tiempo en Horas: ");
                hora = t.nextFloat();
                n = hora * 3600;
                dias = (float) n / 86400;
                hora = (float)hora;
                min = (float) hora * 60;
                sec = (float) n;
                System.out.println("---\nConversion\n---");
                System.out.printf("Dias: %.2f\nHoras: %.2f\nMinuto: %.2f\nSegundo: %.2f\n---\n", dias,hora,min,sec);
            }
            break;
            case 3: {
                System.out.print("---\nIngrese tiempo en Minuto: ");
                min = t.nextFloat();
                n = min * 60;
                dias = (float)n/86400;
                hora = (float)min/60;
                sec = (float) n;
                System.out.println("---\nConversion\n---");
                System.out.printf("Dias: %.2f\nHoras: %.2f\nMinuto: %.2f\nSegundo: %.2f\n---\n", dias,hora,min,sec);
            }
            break;
            case 4: {
                System.out.print("---\nIngrese tiempo en segundos: ");
                n = t.nextFloat();
                dias = n / 86400;
                hora = n/ 3600;
                min = n/60;
                sec = n;
                System.out.println("---\nConversion\n---");
                System.out.printf("Dias: %.2f\nHoras: %.2f\nMinuto: %.2f\nSegundo: %.2f\n---\n", dias, hora, min, sec);
            }
            break;
        }
    }
}
