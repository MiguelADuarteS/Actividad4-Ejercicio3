/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio3;

/**
 *
 * @author mduar
 */
public class Reserva {

    private Habitacion habitacion;
    private Cliente cliente;
    private int totalPago;

    public Reserva(Habitacion habitacion, Cliente cliente) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.totalPago = (int) habitacion.getPrecio();
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getTotalPago() {
        return totalPago;
    }
}
