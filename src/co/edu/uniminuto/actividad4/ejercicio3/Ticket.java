/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio3;

/**
 *
 * @author mduar
 */
public class Ticket {

    public static void imprimir(Reserva reserva) {
        System.out.println("¡Reserva confirmada!");
        System.out.println("Cliente: " + reserva.getCliente().getNombre() + " " + reserva.getCliente().getApellido());
        System.out.println("Documento: " + reserva.getCliente().getDocumento());
        System.out.println("Habitación: " + reserva.getHabitacion().getNumero());
        System.out.println("Precio: $" + reserva.getTotalPago());
    }

}
