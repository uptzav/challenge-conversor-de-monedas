package com.alura.conversormonedas.modelos;

public class Moneda {

    private final String monedaBase;
    private final String monedaObjetivo;
    private final double tasaConvertido;

    public Moneda(MonedasAPI monedaApi) {
        this.monedaBase = monedaApi.base_code();
        this.monedaObjetivo = monedaApi.target_code();
        this.tasaConvertido = monedaApi.conversion_rate();
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public double getTasaConvertido() {
        return tasaConvertido;
    }
}
