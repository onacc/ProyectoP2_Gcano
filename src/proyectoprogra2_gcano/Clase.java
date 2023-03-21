/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2_gcano;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gcano
 */
public class Clase  implements Serializable {
    private String nombre,periodo;
    private Date hora; 
    private int id, unidadesval,annio,semestre;
    private ArrayList<Examen> examenes = new ArrayList();
    private static final long SerialVersionUID=557L;

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    public Clase(String nombre, Date hora, int semestre, String periodo, int id, int unidadesval,int annio) {
        this.nombre = nombre;
        this.hora = hora;
        this.semestre = semestre;
        this.periodo = periodo;
        this.id = id;
        this.unidadesval = unidadesval;
        this.annio = annio;
    }

    public Clase() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnidadesval() {
        return unidadesval;
    }

    public void setUnidadesval(int unidadesval) {
        this.unidadesval = unidadesval;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
