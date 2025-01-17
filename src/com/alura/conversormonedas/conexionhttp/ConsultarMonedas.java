package com.alura.conversormonedas.conexionhttp;

import com.alura.conversormonedas.modelos.MonedasAPI;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultarMonedas {

    private static final String API_KEY = "";

    public MonedasAPI buscarMoneda(String monedaBase, String monedaObjetivo) {
        var uriDeApi = URI.create(String.format(
                "https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/",
                API_KEY, monedaBase, monedaObjetivo));

        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder().uri(uriDeApi).build();

        try {
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MonedasAPI.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró ningún tipo de moneda.", e);
        }
    }
}
