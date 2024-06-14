package org.example;

public class Servicio {
    private String nombre;
    private String descripcion;

    // Constructores
    public Servicio() {}

    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
    }
}
