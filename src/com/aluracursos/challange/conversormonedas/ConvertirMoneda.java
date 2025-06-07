//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aluracursos.challange.conversormonedas;

import java.io.IOException;
import java.util.List;

public class ConvertirMoneda {
    public static void convertir(String baseCode, String targetCode, double cantidad, List<com.aluracursos.challange.conversormonedas.Monedas> historial) throws IOException, InterruptedException {
        ConexionApi service = new ConexionApi();
        com.aluracursos.challange.conversormonedas.Monedas consultaMoneda = service.consultarTasa(baseCode, targetCode);
        if (consultaMoneda != null && "success".equalsIgnoreCase(consultaMoneda.getResult())) {
            System.out.println("Consulta exitosa");
            double tasaCambio = consultaMoneda.getConversion_rate();
            double cantidadConvertida = tasaCambio * cantidad;
            System.out.println("La tasa de cambio de " + baseCode + " a " + targetCode + " es: \n" + com.aluracursos.challange.conversormonedas.Formatos.formatearMoneda(cantidadConvertida));
            com.aluracursos.challange.conversormonedas.Monedas monedaConValores = new com.aluracursos.challange.conversormonedas.Monedas(consultaMoneda.getResult(), consultaMoneda.base_code(), consultaMoneda.getConversion_rate(), cantidad, consultaMoneda.target_code(), cantidadConvertida);
            historial.add(monedaConValores);
        } else {
            String var10001 = consultaMoneda != null ? consultaMoneda.getResult() : "Respuesta nula";
            System.out.println("No se pudo obtener la tasa de cambio. Motivo " + var10001);
        }

    }
}
