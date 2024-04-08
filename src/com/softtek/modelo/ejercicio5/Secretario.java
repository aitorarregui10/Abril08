package com.softtek.modelo.ejercicio5;

public class Secretario implements Empleado{
    private Informe informe;
    private String empresa;
    private String email;

    @Override
    public String getTareas() {
        return null;
    }

    @Override
    public void getInforme(Informe informe) {
        this.informe = informe;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }
}
