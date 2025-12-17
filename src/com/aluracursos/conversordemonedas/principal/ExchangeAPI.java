package com.aluracursos.conversordemonedas.principal;

import com.aluracursos.conversordemonedas.conversor.Conversor;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeAPI {

    public String conversion(String valorBase)
    {
        URI direccion = URI.create(
                "https://v6.exchangerate-api.com/v6/ce82e0dff739dbae8296489f/latest/"
                        + valorBase);
        return "Si";
    }

    public Conversor conversionPar(String valor1, String valor2)
    {
        URI direccion = URI.create(
                "https://v6.exchangerate-api.com/v6/ce82e0dff739dbae8296489f/pair/"
                + valor1 + "/" + valor2);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
