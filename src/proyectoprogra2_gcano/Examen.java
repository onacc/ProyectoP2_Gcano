/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2_gcano;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author gcano
 */
public class Examen {

    public Examen() {
    }
    
    private String Descripcion,Titulo;
    private ArrayList<Pregunta> preguntas = new ArrayList();
    private double nota;
    private Timer time;
    private Calendar date =Calendar.getInstance();
    private JDialog frame = new JDialog();
    

    public JDialog getFrame() {
        return frame;
    }

    public void setFrame(JDialog frame) {
        this.frame = frame;
    }
    

    public String getDescripcion() {
        return Descripcion;
    }

    public Examen(String Descripcion, String Titulo, double nota) {
        this.Descripcion = Descripcion;
        this.Titulo = Titulo;
        this.nota = nota;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Timer getTime() {
        return time;
    }

    public void setTime(Timer time) {
        this.time = time;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public TimerTask getTask() {
        return task;
    }

    public void setTask(TimerTask task) {
        this.task = task;
    }
    
    private TimerTask task = new TimerTask() {
        @Override
        public void run() {
            JOptionPane.showMessageDialog(frame, "El tiempo ha culminado");
            frame.setVisible(false);
        }
    };
}
