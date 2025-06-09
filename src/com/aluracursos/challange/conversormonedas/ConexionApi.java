//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.aluracursos.challange.conversormonedas;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ConexionApi {
    public Monedas consultarTasa(String baseCode, String targetCode){

        try {
            String direccion = "https://v6.exchangerate-api.com/v6/261101e6981abe315b941315/pair/" + baseCode + "/" + targetCode;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            String json = (String) response.body();
            Gson gson = new Gson();
            Monedas monedas = gson.fromJson(json, Monedas.class);
            return monedas;
        }catch (IOException | InterruptedException e) {
            System.out.println("Error al consultar la API: " + e.getMessage());
            return null;
        }
    }
}
