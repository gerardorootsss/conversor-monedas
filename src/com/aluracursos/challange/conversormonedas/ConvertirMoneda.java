//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aluracursos.challange.conversormonedas;

import java.io.IOException;
import java.util.List;

public class ConvertirMoneda {
    public static void convertir(String baseCode, String targetCode, double cantidad, List<Monedas> historial)
            throws IOException, InterruptedException {
        ConexionApi service = new ConexionApi();
        Monedas consultaMoneda = service.consultarTasa(baseCode, targetCode);
        if (consultaMoneda != null && "success".equalsIgnoreCase(consultaMoneda.getResult())){
            System.out.println("Consulta exitosa");
            double tasaCambio = consultaMoneda.getConversion_rate();
            double cantidadConvertida = tasaCambio * cantidad;
            System.out.println("La tasa de cambio de " + baseCode + " a " + targetCode + " es: \n"
                    + Formatos.formatearMoneda(cantidadConvertida));
            Monedas monedaConValores = new Monedas(
                    consultaMoneda.getResult(),
                    consultaMoneda.getBase_code(),
                    consultaMoneda.getConversion_rate(),
                    cantidad,
                    consultaMoneda.getTarget_code(),
                    cantidadConvertida);
            historial.add(monedaConValores);
        } else {
            String respuestaNula = consultaMoneda != null ? consultaMoneda.getResult() : "Respuesta nula";
            System.out.println("No se pudo obtener la tasa de cambio. Motivo " + respuestaNula);
        }

    }
}
