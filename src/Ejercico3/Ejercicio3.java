/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercico3;

import co.edu.uniminuto.actividad4.ejercicio3.Cliente;
import co.edu.uniminuto.actividad4.ejercicio3.Habitacion;
import co.edu.uniminuto.actividad4.ejercicio3.Hotel;
import co.edu.uniminuto.actividad4.ejercicio3.Reserva;
import co.edu.uniminuto.actividad4.ejercicio3.Ticket;
import java.util.Scanner;

/**
 *
 * @author mduar
 */
public class Ejercicio3 {

    private static String nombre;
    private static String apellido;
    private static int documento;
    private static int telefono;
    private static String habitaciones;
    private static int i;
    private static Hotel Habitacion;

    public static void main(String[] args) {
        /*
 * 3. Crea un sistema para gestionar reservas en un hotel. Se desea emitir un ticket donde esté
la habitación reservada, datos personales del cliente y el pago por la habitación. Crear un
menú que simule gestionar habitaciones, usuarios y crear la reserva (impresión de ticket).
         */
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(15);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ver habitaciones disponibles");
            System.out.println("2. Hacer reserva");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarHabitacionesDisponibles(hotel);
                    break;
                case 2:
                    hacerReserva(hotel);
                    break;
                case 3:
                    System.out.println("¡Gracias por su visita!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        } while (opcion != 3);
    }

    public static void mostrarHabitacionesDisponibles(Hotel hotel) {
        System.out.println("\nHabitaciones Disponibles:");
        for (Habitacion habitacion : hotel.getHabitaciones()) {
            System.out.println("Habitación " + habitacion.getNumero() + ": Capacidad " + habitacion.getCapacidad() + ", Precio $" + habitacion.getPrecio());
        }
    }

    public static void hacerReserva(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese su documento: ");
        String documento = scanner.nextLine();
        System.out.print("Ingrese el número de habitación a reservar: ");
        int numeroHabitacion = scanner.nextInt();

        Habitacion habitacion = hotel.getHabitaciones()[numeroHabitacion - 1];
        Cliente cliente = new Cliente(nombre, apellido, documento);
        Reserva reserva = new Reserva(habitacion, cliente);
        Ticket.imprimir(reserva);
    }
}
