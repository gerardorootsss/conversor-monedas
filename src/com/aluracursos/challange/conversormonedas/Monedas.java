//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aluracursos.challange.conversormonedas;

public record Monedas(String result, String base_code, double conversion_rate, double cantidad, String target_code, double cantidadConvertida) {
    public String toString() {
        return "Moneda base: " + this.base_code + "\nTasa: " + this.conversion_rate + "\nCantidad a convertir: " + this.cantidad + "\nMoneda objetivo: " + this.target_code + "\nCantidad convertida: " + this.cantidadConvertida + "\n";
    }

    public String getResult() {
        return this.result;
    }

    public double getConversion_rate() {
        return this.conversion_rate;
    }
}
