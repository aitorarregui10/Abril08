package com.softtek.presentacion;

import com.softtek.modelo.ejercicio4.SeguroCoche;
import com.softtek.modelo.ejercicio4.TallerMecanica;
import com.softtek.modelo.ejercicio4.TallerPintura;

public class Ejercicio4 {
    public static void main(String[] args) {
        SeguroCoche seguro = new SeguroCoche();
        TallerMecanica taller = new TallerMecanica();
        seguro.setTaller(taller);
        TallerPintura taller2 = new TallerPintura();
        seguro.setTaller2(taller2);
        System.out.println(seguro.reparar());
    }


}
