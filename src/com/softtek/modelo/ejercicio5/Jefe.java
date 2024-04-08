package com.softtek.modelo.ejercicio5;

public class Jefe implements Empleado{
    private Informe informe;

    @Override
    public String getTareas() {
        return null;
    }

    @Override
    public void getInforme(Informe informe) {

        this.informe = informe;
    }

    public void jefe(Informe informe) {
        this.informe = informe;
    }
}
