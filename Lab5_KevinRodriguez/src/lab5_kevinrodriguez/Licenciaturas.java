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
public class Licenciaturas extends carrera{
    public String tipo_carrera;

    public Licenciaturas() {
    }

    public Licenciaturas(String tipo_carrera) {
        this.tipo_carrera = tipo_carrera;
    }

    public Licenciaturas(String tipo_carrera, String nombre, String Facultad, String Costo_Mensual, String Jefe_de_carrera) {
        super(nombre, Facultad, Costo_Mensual, Jefe_de_carrera);
        this.tipo_carrera = tipo_carrera;
    }

    public String getTipo_carrera() {
        return tipo_carrera;
    }

    public void setTipo_carrera(String tipo_carrera) {
        this.tipo_carrera = tipo_carrera;
    }
    
}
