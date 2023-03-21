/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2_gcano;

/**
 *
 * @author gcano
 */
public class TrueorFalse extends Pregunta {
    boolean verdadero, falso;

    public TrueorFalse() {
    super();
    }

    public TrueorFalse(boolean verdadero, boolean falso, String interrogante) {
        super(interrogante);
        this.verdadero = verdadero;
        this.falso = falso;
    }

    public boolean isVerdadero() {
        return verdadero;
    }

    public void setVerdadero(boolean verdadero) {
        this.verdadero = verdadero;
    }

    public boolean isFalso() {
        return falso;
    }

    public void setFalso(boolean falso) {
        this.falso = falso;
    }
    
}
