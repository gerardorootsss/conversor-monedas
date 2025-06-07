package com.aluracursos.challange.conversormonedas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Monedas> historial = new ArrayList<>();
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido al conversor de monedas\n");
        double cantidad = 0;
        while (true) {
            System.out.println("Seleccione una opcion: \n" +
                    "1. Consultar tasas disponibles\n" +
                    "2. Convertir moneda\n" +
                    "3. Historial de consultas\n" +
                    "9. Salir");
            var opcion = lectura.nextInt();
            switch (opcion) {
                case 1:
                    String infoMonedas = """
                            USD – Estados Unidos / EUR – Unión Europea
                            JPY – Japón / GBP – Reino Unido
                            CNY – China / CHF – Suiza
                            CAD – Canadá / AUD – Australia
                            NZD – Nueva Zelanda / BRL – Brasil
                            INR – India / KRW – Corea del Sur
                            RUB – Rusia / MXN – México
                            SGD – Singapur / ARS - Argentina
                            COP – Colombia / CLP – Chile
                            """;
                    System.out.println("MONEDAS DISPONIBLES: \n" + infoMonedas);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desea cambiar:");
                    while (true) {
                        if (lectura.hasNextDouble()) {
                            cantidad = lectura.nextDouble();
                            lectura.nextLine(); // Limpiar el buffer
                            break;
                        } else {
                            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                            lectura.nextLine(); // Limpiar la entrada inválida
                        }
                    }
                    System.out.println("Escriba el código de la moneda base (ejemplo: USD, EUR): ");
                    var baseCode = lectura.nextLine();
                    System.out.println("Escriba el código de la moneda objetivo (ejemplo: MXN, JPY): ");
                    var targetCode = lectura.nextLine();

                    ConvertirMoneda.convertir(baseCode, targetCode, cantidad, historial);
                    break;
                case 3:
                    if (historial.isEmpty()) {
                        System.out.println("No hay consultas en el historial.");
                    } else {
                        try {
                            CrearArchivo.crearArchivo(historial);
                            System.out.println("Historial de consultas: \n" + historial);
                        } catch (IOException e) {
                            System.out.println("Error al guardar o leer el historial: " + e.getMessage());
                        }
                    }
                    break;
                case 9:
                    System.out.println("Saliendo del programa... \n");
                    lectura.close();
                    return;
            }
        }
    }
}