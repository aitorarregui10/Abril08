package com.softtek.modelo.ejercicio4;

public abstract class SeguroCoche extends Coche implements ITaller {
    //Atributo
    private ITaller taller;
    private String aseguradora;

    //Método
    public String reparar(Coche coche) {
        return "";
    }

    //Constructor
    public SeguroCoche(String matricula, String modelo, ITaller taller, String aseguradora) {
        super(matricula, modelo);
        this.taller = taller;
        this.aseguradora = aseguradora;
    }
}
