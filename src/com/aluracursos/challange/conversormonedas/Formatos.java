//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aluracursos.challange.conversormonedas;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatos {
    // Formatea como moneda según el Locale y decimales deseados
    public static String formatearMoneda(double cantidadConvertida, Locale locale, int decimales) {
        NumberFormat formato = NumberFormat.getCurrencyInstance(locale);
        formato.setMinimumFractionDigits(decimales);
        formato.setMaximumFractionDigits(decimales);
        return formato.format(cantidadConvertida);
    }

    // Formatea como número normal según decimales deseados
    public static String formatearNumero(double cantidad, Locale locale, int decimales) {
        NumberFormat formato = NumberFormat.getCurrencyInstance(locale);
        formato.setMinimumFractionDigits(decimales);
        formato.setMaximumFractionDigits(decimales);
        return formato.format(cantidad);
    }
}
