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
public class maestros {
    public String Nombre;
    public String apellido;
    public String salario;
    public int edad;
    public String lista_clases;

    public maestros() {
    }

    public maestros(String Nombre, String apellido, String salario, int edad, String lista_clases) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
        this.lista_clases = lista_clases;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLista_clases() {
        return lista_clases;
    }

    public void setLista_clases(String lista_clases) {
        this.lista_clases = lista_clases;
    }
    
    
}
