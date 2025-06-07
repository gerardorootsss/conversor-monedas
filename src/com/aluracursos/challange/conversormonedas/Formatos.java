//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aluracursos.challange.conversormonedas;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatos {
    public static String formatearMoneda(double cantidadConvertida) {
        NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.US);
        formato.setMinimumFractionDigits(2);
        formato.setMaximumFractionDigits(2);
        return formato.format(cantidadConvertida);
    }
}
