package com.alura.conversormonedas.principal;

import com.alura.conversormonedas.calculos.CalcularMonedas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (var teclado = new Scanner(System.in)) {
            var mostrar = new CalcularMonedas();

            while (true) {
                System.out.println("""
                ****************************************************
                ¡Bienvenido/a al Conversor de Monedas!
                
                1. Dólar a Peso Argentino
                2. Peso Argentino a Dólar
                3. Dólar a Real Brasileño
                4. Real Brasileño a Dólar
                5. Dólar a Peso Colombiano
                6. Peso Colombiano a Dólar
                7. Salir
                ****************************************************
                """);
                System.out.print("Elige una opción válida: ");

                try {
                    int opcion = Integer.parseInt(teclado.next());
                    if (opcion == 7) {
                        System.out.println("Saliendo del programa. ¡Que tengas un buen día!");
                        break;
                    }

                    switch (opcion) {
                        case 1 -> mostrar.calcularConversion("USD", "ARS", teclado);
                        case 2 -> mostrar.calcularConversion("ARS", "USD", teclado);
                        case 3 -> mostrar.calcularConversion("USD", "BRL", teclado);
                        case 4 -> mostrar.calcularConversion("BRL", "USD", teclado);
                        case 5 -> mostrar.calcularConversion("USD", "COP", teclado);
                        case 6 -> mostrar.calcularConversion("COP", "USD", teclado);
                        default -> System.out.println("Error: Opción no válida. Intenta de nuevo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingresa un número válido.");
                }
            }
        }
    }
}
