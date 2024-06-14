package org.example;

public class Normal extends Servicio{
    int seleccionAsiento;
    int espacioMaleta;
    double maletaAdicional;

    public Normal() {}
    public Normal(String nombre, String descripcion, int seleccionAsiento, int espacioMaleta) {
        super(nombre, descripcion);
        this.seleccionAsiento = seleccionAsiento;
        this.espacioMaleta = espacioMaleta;
    }

    public int getSeleccionAsiento() {
        return seleccionAsiento;
    }

    public void setSeleccionAsiento(int seleccionAsiento) {
        this.seleccionAsiento = seleccionAsiento;
    }

    public int getEspacioMaleta() {
        return espacioMaleta;
    }

    public void setEspacioMaleta(int espacioMaleta) {
        this.espacioMaleta = espacioMaleta;
    }

    public double getMaletaAdicional() {
        return maletaAdicional;
    }

    public void setMaletaAdicional(double maletaAdicional) {
        this.maletaAdicional = maletaAdicional;
    }


    public void mostrarServicio2(){
        System.out.println("****** Servicio Normal *******");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Seleccion Asiento: " + getSeleccionAsiento());
        System.out.println("Espacio Maleta: " + getEspacioMaleta());
        System.out.println("Maleta Adicional: " + getMaletaAdicional());
    }
}
