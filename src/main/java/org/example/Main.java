package org.example;

public class Main {
    public static void main(String[] args) {

        // Instancias con valores nulos
        Pasajero pasajero3 = new Pasajero(null, null);
        Pasajero pasajero4 = new Pasajero(null, null);
        Pasajero pasajero5 = new Pasajero(null, null);
        Pasajero pasajero6 = new Pasajero(null, null);
        Pasajero pasajero7 = new Pasajero(null, null);

        pasajero3.setNombre("Pedro");
        pasajero3.setCedula("5432167890");

        pasajero4.setNombre("Ana");
        pasajero4.setCedula("0987123456");

        pasajero5.setNombre("Luis");
        pasajero5.setCedula("1234543210");

        pasajero6.setNombre("Laura");
        pasajero6.setCedula("6789054321");

        pasajero7.setNombre("Carlos");
        pasajero7.setCedula("4321098765");

        System.out.println("Información de los Pasajeros con valores nulos y  seteados:");
        pasajero3.imprimirInfoPasajero();
        pasajero4.imprimirInfoPasajero();
        pasajero5.imprimirInfoPasajero();
        pasajero6.imprimirInfoPasajero();
        pasajero7.imprimirInfoPasajero();

        // Instancias
        Pasajero pasajero1 = new Pasajero("Juan", "1234567890");
        Pasajero pasajero2 = new Pasajero("María", "0987654321");


        System.out.println("Información de los Pasajeros:");
        pasajero1.imprimirInfoPasajero();
        pasajero2.imprimirInfoPasajero();
        System.out.println();


        Ticket ticket1 = new Ticket(12, "El Búho", 20.0f);
        Ticket ticket2 = new Ticket(22, "El Búho", 17.5f);

        System.out.println("Información de los Tickets:");
        ticket1.mostrarDatos();
        ticket2.mostrarDatos();
        System.out.println();

        // Instanciar objetos de la clase Servicio
        Servicio servicio1 = new Servicio("Servicio 1", "Descripción del Servicio 1");
        Servicio servicio2 = new Servicio("Servicio 2", "Descripción del Servicio 2");

        // Imprimir información de los servicios
        System.out.println("Información de los Servicios:");
        servicio1.mostrarDatos();
        servicio2.mostrarDatos();
        System.out.println();

        // Instanciar objetos de la clase Ruta
        Ruta ruta1 = new Ruta("Quito", "Guayaquil", 20.0);
        Ruta ruta2 = new Ruta("Quito", "Tulcán", 17.5);

        // Imprimir información de las rutas
        System.out.println("Información de las Rutas:");
        ruta1.mostrarRuta();
        ruta2.mostrarRuta();
        System.out.println();

        // Calcular el costo del pasaje para una ruta y tipo de servicio
        double costoPasajeRuta1Normal = calcularCostoPasaje(ruta1, "Normal");
        double costoPasajeRuta2VIP = calcularCostoPasaje(ruta2, "VIP");

        System.out.println("Costo del pasaje para la Ruta 1 (Normal): $" + costoPasajeRuta1Normal);
        System.out.println("Costo del pasaje para la Ruta 2 (VIP): $" + costoPasajeRuta2VIP);

    }



    // Método
    public static double calcularCostoPasaje(Ruta ruta, String tipoServicio) {
        double costoPasaje = ruta.getPasaje();

        if (tipoServicio.equals("VIP")) {
            costoPasaje *= 1.3;
        }
        return costoPasaje;
    }
}

