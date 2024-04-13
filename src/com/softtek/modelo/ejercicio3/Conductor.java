package com.softtek.modelo.ejercicio3;

public class Conductor implements IVehiculo{
    //Atributo
    private IVehiculo vehiculo;

    //Métodos
    public String conducir() {

        if (vehiculo != null) {
            return vehiculo.moverse();
        } else {
            return "Esto se llama andar...";
        }
    }
    @Override
    public String moverse() {
        return null;
    }

    // Constructores

    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Setter

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}