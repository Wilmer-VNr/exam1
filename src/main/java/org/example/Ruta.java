package org.example;

public class Ruta {
    String origen;
    String destino;
    double pasaje;
    public Ruta(String origen, String destino, double pasaje) {
        this.origen = origen;
        this.destino = destino;
        this.pasaje = pasaje;

    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPasaje() {
        return pasaje;
    }

    public void setPasaje(double pasaje) {
        this.pasaje = pasaje;
    }


    public void mostrarRuta(){
        System.out.println("Origen: " + getOrigen());
        System.out.println("Destino: " + getDestino());
        System.out.println("Pasaje: " + getPasaje());

    }
}
