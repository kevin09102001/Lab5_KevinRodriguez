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
public class carrera {
    public String nombre;
    public String Facultad;
    public String Costo_Mensual;
    public String Jefe_de_carrera;

    public carrera() {
    }

    public carrera(String nombre, String Facultad, String Costo_Mensual, String Jefe_de_carrera) {
        this.nombre = nombre;
        this.Facultad = Facultad;
        this.Costo_Mensual = Costo_Mensual;
        this.Jefe_de_carrera = Jefe_de_carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public String getCosto_Mensual() {
        return Costo_Mensual;
    }

    public void setCosto_Mensual(String Costo_Mensual) {
        this.Costo_Mensual = Costo_Mensual;
    }

    public String getJefe_de_carrera() {
        return Jefe_de_carrera;
    }

    public void setJefe_de_carrera(String Jefe_de_carrera) {
        this.Jefe_de_carrera = Jefe_de_carrera;
    }

    @Override
    public String toString() {
        return "carrera{" + "nombre=" + nombre + ", Facultad=" + Facultad + ", Costo_Mensual=" + Costo_Mensual + ", Jefe_de_carrera=" + Jefe_de_carrera + '}';
    }

    
   
    
}
