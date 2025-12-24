package com.aluracursos.conversordemonedas.principal;

import com.aluracursos.conversordemonedas.conversor.Conversor;

import java.util.Scanner;

public class Principal {

    static void main() {
        // mostrar menu

        Scanner teclado = new Scanner(System.in);
        ExchangeAPI convertir = new ExchangeAPI();

        IO.println("Sea bienvenidx al Conversor de Moneda ! :D");

        while(true)
        {
            convertir.mostrarMenu();
            var valor = teclado.nextInt();
            Conversor resultado = new Conversor(1);

            switch(valor)
            {
                case 1: // Dólar Americano => Peso Argentino (USD -> ARS)
                    resultado = convertir.conversionPar("USD", "ARS");
                    break;
                case 2: // Peso Argentino => Dolar Americano (ARS -> USD)
                    resultado = convertir.conversionPar("ARS", "USD");
                    break;
                case 3: // Dólar Americano => Real Brasileño (USD -> BRL)
                    resultado = convertir.conversionPar("USD", "BRL");
                    break;
                case 4: // Real Brasileño => Dólar Americano (BRL -> USD)
                    resultado = convertir.conversionPar("BRL", "USD");
                    break;
                case 5: // Dólar Americano => Peso Chileno (USD -> CLP)
                    resultado = convertir.conversionPar("USD", "CLP");
                    break;
                case 6: // Peso Chileno => Dólar Americano (CLP -> USD)
                    resultado = convertir.conversionPar("CLP", "USD");
                    break;
                case 7: // Salir
                    break;
                default: // caso distinto de 1 a 7
                    IO.println("El numero ingresado es incorrecto");
                    break;
            }

            IO.println("Resultado de la conversion: " + resultado);
            if(resultado.conversion_rate() == 7)
                break;
        }


        // -- generar solicitud - recibir respuesta
        // mostrar respuesta - mostrar menu
    }
}
