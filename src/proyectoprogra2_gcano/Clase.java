/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2_gcano;

import java.util.Date;

/**
 *
 * @author gcano
 */
public class Clase {
    private String nombre,semestre,periodo;
    private Date hora; 
    private int id, unidadesval,annio;

    public Clase(String nombre, Date hora, String semestre, String periodo, int id, int unidadesval) {
        this.nombre = nombre;
        this.hora = hora;
        this.semestre = semestre;
        this.periodo = periodo;
        this.id = id;
        this.unidadesval = unidadesval;
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

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
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
