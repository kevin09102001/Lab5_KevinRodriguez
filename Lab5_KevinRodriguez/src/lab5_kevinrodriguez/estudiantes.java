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
public class estudiantes {
    public String nombre;
    public String apellido;
    public String Numero_Cuenta;
    public String Edad;
    public String Genero;
    public String Carrera;

    public estudiantes() {
    }

    public estudiantes(String nombre, String apellido, String Numero_Cuenta, String Edad, String Genero, String Carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Numero_Cuenta = Numero_Cuenta;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Carrera = Carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero_Cuenta() {
        return Numero_Cuenta;
    }

    public void setNumero_Cuenta(String Numero_Cuenta) {
        this.Numero_Cuenta = Numero_Cuenta;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}
