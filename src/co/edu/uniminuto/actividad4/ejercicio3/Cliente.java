/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio3;

/**
 *
 * @author mduar
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String documento;

    public Cliente(String nombre, String apellido, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }
}
