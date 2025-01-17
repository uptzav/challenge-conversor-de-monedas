package com.alura.conversormonedas.calculos;

import com.alura.conversormonedas.conexionhttp.ConsultarMonedas;
import com.alura.conversormonedas.modelos.Moneda;


import java.util.Scanner;

public class CalcularMonedas {

    public void calcularConversion(String monedaBase, String monedaObjetivo, Scanner teclado) {
        System.out.println("\nIngresa la cifra que deseas convertir:");

        try {
            double cifra = Double.parseDouble(teclado.next());

            if (cifra < 0) {
                System.out.println("La cifra no puede ser negativa. Inténtalo de nuevo.");
                return;
            }

            var consultar = new ConsultarMonedas();
            var monedasAPI = consultar.buscarMoneda(monedaBase, monedaObjetivo);
            var moneda = new Moneda(monedasAPI);

            double cifraTotal = cifra * moneda.getTasaConvertido();

            System.out.printf("\nEl valor %.2f [%s] equivale a: %.2f [%s]\n\n",
                    cifra, monedaBase, cifraTotal, monedaObjetivo);

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresa una cifra válida.");
        } catch (RuntimeException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }
}
