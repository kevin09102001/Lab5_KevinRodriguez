/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class clases {
    public String Nombre;
    public String seccion;
    public int edificio;
    public String salon;
    public String aire_acondicionado;

    public clases() {
    }

    public clases(String Nombre, String seccion, int edificio, String salon, String aire_acondicionado) {
        this.Nombre = Nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.aire_acondicionado = aire_acondicionado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getAire_acondicionado() {
        return aire_acondicionado;
    }

    public void setAire_acondicionado(String aire_acondicionado) {
        this.aire_acondicionado = aire_acondicionado;
    }
    
}
