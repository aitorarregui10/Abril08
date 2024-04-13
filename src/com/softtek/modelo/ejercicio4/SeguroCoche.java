package com.softtek.modelo.ejercicio4;

public class SeguroCoche extends Coche implements ITaller{
    //Atributo
    private ITaller taller;
    private String aseguradora;


    //Método
    @Override
    public String reparar() {
        if (taller != null) {
            return taller.reparar();
        } else {
            return "No se puede reparar, no hay taller asociado.";
        }
    }

    //Constructor
    public SeguroCoche(String matricula, String modelo, ITaller taller, String aseguradora) {
        super(matricula, modelo);
        this.taller = taller;
        this.aseguradora = aseguradora;
    }
    public SeguroCoche() {
    }

    //Setters

    public void setTaller(TallerMecanica taller) {
    }

    public void setTaller2(TallerPintura taller2) {
    }


}
