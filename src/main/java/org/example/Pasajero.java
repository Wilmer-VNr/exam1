package org.example;

public class Pasajero {
    String nombre;
    String cedula;

    public Pasajero(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Método personalizado

    public void imprimirInfoPasajero() {
        System.out.println("Información del Pasajero:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
    }
}
