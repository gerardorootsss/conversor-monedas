//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aluracursos.challange.conversormonedas;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class ConvertirMoneda {
    public static void convertir(String baseCode,
                                 String targetCode,
                                 double cantidad,
                                 List<Monedas> historial) {

        ConexionApi service = new ConexionApi();
        Monedas consultaMoneda = service.consultarTasa(baseCode, targetCode);
        if (consultaMoneda != null && "success"
                .equalsIgnoreCase(consultaMoneda.
                        getResult())) {
            System.out.println("Consulta exitosa");
            double tasaCambio = consultaMoneda.getConversion_rate();
            double cantidadConvertida = tasaCambio * cantidad;
            System.out.println(Formatos.formatearNumero(cantidad, Locale.US, 0)+
                    " " +  baseCode.toUpperCase() +
                    " equivalen a " + targetCode.toUpperCase() +
                    " " + Formatos.formatearMoneda(cantidadConvertida, Locale.US, 2));
            Monedas monedaConValores = new Monedas(
                    consultaMoneda.getResult(),
                    consultaMoneda.getBase_code(),
                    consultaMoneda.getConversion_rate(),
                    cantidad,
                    consultaMoneda.getTarget_code(),
                    cantidadConvertida);
            historial.add(monedaConValores);
        } else {
            System.out.println("No se pudo obtener la tasa de cambio. Por favor," +
                    " verifique los códigos de moneda ingresados.");
        }
    }
}

