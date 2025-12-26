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
            var opcion = teclado.nextInt();
            double valor = 0;

            if(opcion!=7)
            {
                IO.print("Ingrese el valor que desea convertir: ");
                valor = teclado.nextDouble();
            }


            Conversor resultado = new Conversor(1);
            String divisa1 = "", divisa2 = "";

            switch(opcion)
            {
                case 1: // Dólar Americano => Peso Argentino (USD -> ARS)
                    resultado = convertir.conversionPar("USD", "ARS");
                    divisa1 = "USD"; divisa2 = "ARS";
                    break;
                case 2: // Peso Argentino => Dolar Americano (ARS -> USD)
                    resultado = convertir.conversionPar("ARS", "USD");
                    divisa1 = "ARS"; divisa2 = "USD";
                    break;
                case 3: // Dólar Americano => Real Brasileño (USD -> BRL)
                    resultado = convertir.conversionPar("USD", "BRL");
                    divisa1 = "USD"; divisa2 = "BRL";
                    break;
                case 4: // Real Brasileño => Dólar Americano (BRL -> USD)
                    resultado = convertir.conversionPar("BRL", "USD");
                    divisa1 = "BRL"; divisa2 = "USD";
                    break;
                case 5: // Dólar Americano => Peso Chileno (USD -> CLP)
                    resultado = convertir.conversionPar("USD", "CLP");
                    divisa1 = "USD"; divisa2 = "CLP";
                    break;
                case 6: // Peso Chileno => Dólar Americano (CLP -> USD)
                    resultado = convertir.conversionPar("CLP", "USD");
                    divisa1 = "CLP"; divisa2 = "USD";
                    break;
                case 7: // Salir
                    break;
                default: // caso distinto de 1 a 7
                    IO.println("El numero ingresado es incorrecto");
                    opcion = 8;
                    break;
            }

            if(opcion == 7)
                break;

            if(opcion != 8)
            {
                IO.println("Resultado de la conversion: " + resultado);

                IO.println("El resultado de la conversión de " + valor + " " + divisa1 +
                        " es de : " + valor * resultado.conversion_rate() + " " + divisa2);
            }
        }

        IO.println("\nGracias por utilizar el Conversor de monedas del curso de Alura!\nHasta Pronto!");
        // mostrar respuesta - mostrar menu
    }
}
