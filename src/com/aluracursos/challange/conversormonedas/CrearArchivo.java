//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aluracursos.challange.conversormonedas;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CrearArchivo {
    public static void crearArchivo(List<Monedas> historial) throws IOException {
        Gson gson = (new GsonBuilder())
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(historial);
        FileWriter archivo = new FileWriter("historial.json");
        archivo.write(json);
        archivo.close();
    }
}
