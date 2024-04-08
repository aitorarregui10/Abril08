package com.softtek.modelo.ejercicio3;

public abstract class Conductor {
    //Atributo
    private IVehiculo vehiculo;

    //Métodos
    public abstract String conducir();


    // Constructores
    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
