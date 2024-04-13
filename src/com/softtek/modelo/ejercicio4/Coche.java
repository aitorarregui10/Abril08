package com.softtek.modelo.ejercicio4;

public class Coche {
    //Atributos
    private String matricula;
    private String modelo;

    //Constructor

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }
    public Coche() {
    }

    //Setters y Getters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
