/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra2_gcano;

import java.io.Serializable;

/**
 *
 * @author gcano
 */
public class Usuario implements Serializable {
    protected String password, user, rol;
    private static final long SerialVersionUID=559L;

    public Usuario(String password, String user, String rol) {
        this.password = password;
        this.user = user;
        this.rol = rol;
    }

    public Usuario() {
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return user;
    }
    
}
