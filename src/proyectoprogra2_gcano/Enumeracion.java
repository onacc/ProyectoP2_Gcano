/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2_gcano;

/**
 *
 * @author gcano
 */
public class Enumeracion extends Pregunta {
    private String popcion1, popcion2, popcion3, popcion4;
    private boolean opcion1, opcion2, opcion3, opcion4;

    public Enumeracion(String interrogante) {
        super(interrogante);
    }

    public Enumeracion(String popcion1, String popcion2, String popcion3, String popcion4, boolean opcion1, boolean opcion2, boolean opcion3, boolean opcion4, String interrogante) {
        super(interrogante);
        this.popcion1 = popcion1;
        this.popcion2 = popcion2;
        this.popcion3 = popcion3;
        this.popcion4 = popcion4;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
    }

    public Enumeracion() {
    super();
    }

    public String getPopcion1() {
        return popcion1;
    }

    public void setPopcion1(String popcion1) {
        this.popcion1 = popcion1;
    }

    public String getPopcion2() {
        return popcion2;
    }

    public void setPopcion2(String popcion2) {
        this.popcion2 = popcion2;
    }

    public String getPopcion3() {
        return popcion3;
    }

    public void setPopcion3(String popcion3) {
        this.popcion3 = popcion3;
    }

    public String getPopcion4() {
        return popcion4;
    }

    public void setPopcion4(String popcion4) {
        this.popcion4 = popcion4;
    }

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
