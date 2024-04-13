package com.softtek.modelo.ejercicio3;

public class Coche extends Conductor implements IVehiculo {

    private int gasolina;

    public Coche(int i) {
    }

    @Override
    public String moverse() {
        if (gasolina != 0){
            gasolina --;
            return "movimiento";
        } else {
            return "Vete a la gasolinera a repostar";
        }
    }

    @Override
    public String conducir() {
        return "";
    }
}
