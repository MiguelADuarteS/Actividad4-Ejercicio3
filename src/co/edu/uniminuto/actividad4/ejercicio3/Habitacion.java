/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio3;

/**
 *
 * @author mduar
 */
public class Habitacion {

    private int numero;
    private int capacidad;
    private int precio;

    public Habitacion(int numero, int capacidad, int precio) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPrecio() {
        return precio;
    }
}
