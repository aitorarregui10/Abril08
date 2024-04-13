package com.softtek.presentacion;

import com.softtek.modelo.ejercicio7.Producto;
import com.softtek.modelo.ejercicio7.ProductoException;

public class Ejercicio7 {
    public static void main(String[] args) {

        try {
            // Intenta instanciar un producto con ID inválido o válido
            Producto producto = new Producto(1, "Nombre", 10.0, "Proveedor", "Descripción");
            System.out.println("Genial, has conseguido escribir tu producto correctamente. Estas son las características: "+ producto);
        } catch (IllegalArgumentException e) {
            // Captura y maneja la excepción
            System.out.println("Error al crear el producto: " + e.getMessage());
        }
    }
}
