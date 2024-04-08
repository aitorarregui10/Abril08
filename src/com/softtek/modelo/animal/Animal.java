package com.softtek.modelo.animal;

public abstract class Animal {

    public abstract double comer();

    public abstract String moverse();


   /* ¿Qué ocurre si no implemento todos los métodos?
   Da error en la subclase

   ¿Puedo crear instancias igualmente?

   No. Sigue dando error en la subclase pidiendo que o haces la clase principal que no sea abstracta o implementes el resto de métodos

   ¿Puedo modificar parte de la definición de los métodos abstractos?

    Siempre que se modifique en todas las subclases de forma coherente

    ¿Puedo utilizar polimorfismo?

    Sí. Mientras instancies sólo sobre las clases hijas.

    Crea clases extendiendo la clase Pajaro, por ejemplo Gorrión y Buitre.



    ¿También son abstractas estas clases?

    Serían ya subclases de una clase normal salvo que hagas abstracta Pajaro también. Esto último me da error por los métodos tienen cuerpo
*/
}
