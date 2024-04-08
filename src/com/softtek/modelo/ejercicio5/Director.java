package com.softtek.modelo.ejercicio5;

public class Director implements Empleado{
    private Informe informe;

    @Override
    public String getTareas() {
        return null;
    }

    @Override
    public void getInforme(Informe informe) {
        this.informe = informe;
    }

    public String jefe(Informe informe) {
        return null;
    }
}
