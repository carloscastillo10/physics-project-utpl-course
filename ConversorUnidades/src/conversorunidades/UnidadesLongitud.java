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
public class UnidadesLongitud {
    
    private double kilometros;
    private double hectometros;
    private double decametros;
    private double metros;
    private double decimetros;
    private double centimetros;
    private double milimetros;

    public UnidadesLongitud() {
        agregar_kilometros(0.0);
        agregar_hectometros(0.0);
        agregar_decametros(0.0);
        agregar_metros(0.0);
        agregar_decimetros(0.0);
        agregar_centimetros(0.0);
        agregar_milimetros(0.00);
              
    }
    
    //Metodos de agregar
    public void agregar_kilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public void agregar_hectometros(double hectometros) {
        this.hectometros = hectometros;
    }

    public void agregar_decametros(double decametros) {
        this.decametros = decametros;
    }

    public void agregar_metros(double metros) {
        this.metros = metros;
    }

    public void agregar_decimetros(double decimetros) {
        this.decimetros = decimetros;
    }

    public void agregar_centimetros(double centimetros) {
        this.centimetros = centimetros;
    }

    public void agregar_milimetros(double milimetros) {
        this.milimetros = milimetros;
    }
    
    //Metodos de obtener
    public double obtener_kilometros() {
        return kilometros;
    }

    public double obtener_hectometros() {
        return hectometros;
    }

    public double obtener_decametros() {
        return decametros;
    }

    public double obtener_metros() {
        return metros;
    }

    public double obtener_decimetros() {
        return decimetros;
    }

    public double obtener_centimetros() {
        return centimetros;
    }

    public double obtener_milimetros() {
        return milimetros;
    }    
    
}
