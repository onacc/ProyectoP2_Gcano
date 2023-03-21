/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2_gcano;

/**
 *
 * @author gcano
 */
public class Multiplechoice extends Pregunta  {

    public Multiplechoice() {
    }

    public Multiplechoice(boolean opcion1, boolean opcion2, boolean opcion3, boolean opcion4, String interrogante) {
        super(interrogante);
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
    }

    public Multiplechoice(String interrogante) {
        super(interrogante);
    }
    
    private boolean opcion1, opcion2, opcion3, opcion4;

    public boolean isOpcion1() {
        return opcion1;
    }

    public void setOpcion1(boolean opcion1) {
        this.opcion1 = opcion1;
    }

    public boolean isOpcion2() {
        return opcion2;
    }

    public void setOpcion2(boolean opcion2) {
        this.opcion2 = opcion2;
    }

    public boolean isOpcion3() {
        return opcion3;
    }

    public void setOpcion3(boolean opcion3) {
        this.opcion3 = opcion3;
    }

    public boolean isOpcion4() {
        return opcion4;
    }

    public void setOpcion4(boolean opcion4) {
        this.opcion4 = opcion4;
    }
    
}
