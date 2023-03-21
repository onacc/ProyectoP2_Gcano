/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2_gcano;

/**
 *
 * @author gcano
 */
public class Pregunta {
    private String interrogante;
    private double valor;

    public Pregunta(String interrogante, double valor) {
        this.interrogante = interrogante;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pregunta(String interrogante) {
        this.interrogante = interrogante;
    }

    public Pregunta() {
    }

    public String getInterrogante() {
        return interrogante;
    }

    public void setInterrogante(String interrogante) {
        this.interrogante = interrogante;
    }

    @Override
    public String toString() {
        return "" + interrogante ;
    }
    
}
