package com.softtek.modelo.ejercicio3;

public class Coche extends Conductor implements IVehiculo {

    private int gasolina;

    @Override
    public String moverse() {
        if (gasolina != 0){
            gasolina --;
            return "movimiento";
        } else {
            System.out.println("Vete a la gasolinera a repostar");
            return null;
        }
    }

    @Override
    public String conducir() {
        return "";
    }
}
