package org.example;

public class Ticket {
    int id;
    String nombre;
    float precio;

    public Ticket(int id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void  mostrarDatos(){
        System.out.println("ID: " + id + " Nombre: " + nombre + " Precio: " + precio);
    }
}
