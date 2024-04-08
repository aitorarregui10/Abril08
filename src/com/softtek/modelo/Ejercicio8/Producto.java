package com.softtek.modelo.Ejercicio8;

public class Producto {

    //Atributos
    private int id;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    // Constructores

    public Producto(int id, String nombre, double precio, String proveedor, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }

    public Producto() {
    }

}
