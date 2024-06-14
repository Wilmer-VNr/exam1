package org.example;

import java.sql.SQLOutput;

public class Vip extends Servicio{
    Boolean television, internet;
    String otroServicio;
    int espacioMaleta;
    double maletaAdicionalcosto;
    public Vip() {}
    public Vip( String nombre, String descripcion,Boolean television, Boolean internet, String otroServicio, int espacioMaleta, double maletaCosto){
        super(nombre, descripcion);
        this.television = television;
        this.internet = internet;
        this.otroServicio = otroServicio;
        this.espacioMaleta = espacioMaleta;
        this.maletaAdicionalcosto = maletaCosto;
    }

    public Boolean getTelevision() {
        return television;
    }

    public void setTelevision(Boolean television) {
        this.television = television;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }

    public String getOtroServicio() {
        return otroServicio;
    }

    public void setOtroServicio(String otroServicio) {
        this.otroServicio = otroServicio;
    }

    public int getEspacioMaleta() {
        return espacioMaleta;
    }

    public void setEspacioMaleta(int espacioMaleta) {
        this.espacioMaleta = espacioMaleta;
    }

    public double getMaletaAdicionalcosto() {
        return maletaAdicionalcosto;
    }

    public void setMaletaAdicionalcosto(double maletaAdicionalcosto) {
        this.maletaAdicionalcosto = maletaAdicionalcosto;
    }

    public void mostrarServicio(){
        System.out.println("****** Servicio Vip *******");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Television: " + getTelevision());
        System.out.println("Internet: " + getInternet());
        System.out.println("OtroServicio: " + getOtroServicio());
        System.out.println("Espacio Maleta: " + getEspacioMaleta());
        System.out.println("Maleta Adicional: " + getMaletaAdicionalcosto());

    }
}
