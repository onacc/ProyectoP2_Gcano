/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2_gcano;

import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Maestro extends Usuario {
    private int id,classid;
    private String Nombre, profesion;
    private double sueldo;
    private ArrayList <Clase> clases = new ArrayList();

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public Maestro() {
    super();
    }

    public Maestro(int id, String Nombre, String profesion, double sueldo, String password, String user, String rol) {
        super(password, user, rol);
        this.id = id;
        this.Nombre = Nombre;
        this.profesion = profesion;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
