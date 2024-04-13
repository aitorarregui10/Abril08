package com.softtek.modelo.ejercicio5;

public class Secretario implements Informe, Empleado {
    private Informe informe;
    private String empresa;
    private String email;


    @Override
    public String getTareas() {
        return null;
    }

    @Override
    public String getInforme() {
        return null;
    }
    //Setter
    public void setInforme(Informe informe) {
        this.informe = informe;
    }
}
