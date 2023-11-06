/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pooespol.cliente;

/**
 *
 * @author diego
 */
public class Usuario {
    private String numCedula;
    private String nombres;
    private String apellidos;
    private String user;
    private String contrasenia;
    private String numCelular;

    public Usuario(String numCedula, String nombres, String apellidos, String user, String contrasenia, String numCelular) {
        this.numCedula = numCedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.user = user;
        this.contrasenia = contrasenia;
        this.numCelular = numCelular;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }
    

    
}
