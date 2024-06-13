/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio3;

/**
 *
 * @author mduar
 */
public class Hotel {

    private Habitacion[] habitaciones;

    public Hotel(int numHabitaciones) {
        habitaciones = new Habitacion[numHabitaciones];
        for (int i = 0; i < numHabitaciones; i++) {
            habitaciones[i] = new Habitacion(i + 1, 2, 125000);
        }
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }
}
