package com.softtek.presentacion.Ejercicio3;

import com.softtek.modelo.ejercicio3.Conductor;
import com.softtek.modelo.ejercicio3.IVehiculo;
import com.softtek.modelo.ejercicio3.Coche;

public class Main {
    public static void main(String[] args) {

        Coche c1 = new Coche(0);
        Conductor conductor = new Conductor (c1);
        System.out.println(conductor.conducir());


    }

}
