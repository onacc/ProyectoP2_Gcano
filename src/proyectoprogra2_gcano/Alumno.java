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
public class Alumno extends Usuario {
    private int cuenta;
    //private ArrayList<Clase> clases = new ArrayList();
    private String nombre, carrera;
    private ArrayList <Clase> cursadas = new ArrayList();

    
   

    
    
   
   

    public Alumno() {
    super();
    }

    public Alumno(int cuenta, String nombre, String carrera, String password, String user, String rol) {
        super(password, user, rol);
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clase> getCursadas() {
        return cursadas;
    }

    public void setCursadas(ArrayList<Clase> cursadas) {
        this.cursadas = cursadas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    

    
}
