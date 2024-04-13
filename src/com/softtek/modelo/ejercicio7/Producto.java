package com.softtek.modelo.ejercicio7;

public class Producto {
    //Atributos
    int ID;
    String nombre;
    double precio;
    String proveedor;
    String descripcion;

    // Constructor
    public Producto(int ID, String nombre, double precio, String proveedor, String descripcion) {
        if (ID <= 0) {
            throw new ProductoException("El ID no puede ser menor o igual a cero.");
        }
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }

    // Método toString para que se vea el producto cuando lo metemos bien
    @Override
    public String toString() {
        return "ID: " + ID + ", Nombre: " + nombre + ", Precio: " + precio + ", Proveedor: " + proveedor + ", Descripción: " + descripcion;
    }
}

