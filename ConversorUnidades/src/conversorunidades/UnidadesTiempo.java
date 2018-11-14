/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

/**
 *
 * @author carlos
 */
public class UnidadesTiempo {
    private double dias;
    private double horas;
    private double minutos;
    private double segundos;

    //Constructor
    public UnidadesTiempo(){
        agregar_dias(0);
        agregar_horas(0.0);
        agregar_minutos(0.0);
        agregar_segundos(0.0);
    }
    
    //Metodos de agregar
    public void agregar_dias(double dias) {
        this.dias = dias;
    }
   
    public void agregar_horas(double horas) {
        this.horas = horas;
    }
    
    public void agregar_minutos(double minutos) {
        this.minutos = minutos;
    }
    
    public void agregar_segundos(double segundos) {
        this.segundos = segundos;
    }

    //Metodos de obtener    
    public double obtener_dias() {
        return dias;
    }
    
    public double obtener_horas() {
        return horas;
    }

    public double obtener_minutos() {
        return minutos;
    }

    public double obtener_segundos() {
        return segundos;
    }   
    
}
