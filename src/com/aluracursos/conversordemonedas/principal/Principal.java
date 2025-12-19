package com.aluracursos.conversordemonedas.principal;

import java.util.Scanner;

public class Principal {

    static void main() {
        // mostrar menu
        while(true)
        {
            //      Lista de conversion:
            //          ARS - Peso argentino
            //          BOB - Boliviano boliviano
            //          BRL - Real brasileño
            //          CLP - Peso chileno
            //          COP - Peso colombiano
            //          USD - Dólar estadounidense
            IO.println("""
                    *************************************************
                    Sea bienvenidx al Conversor de Moneda ! :D
                    Escoja una opción para continuar:
                    
                    1) Dólar Americano => Peso Argentino (USD -> ARS)
                    2) Peso Argentino => Dolar Americano (ARS -> USD)
                    3) Dólar Americano => Real Brasileño (USD -> BRL)
                    4) Real Brasileño => Dólar Americano (BRL -> USD)
                    5) Dólar Americano => Peso Chileno (USD -> CLP)
                    6) Peso Chileno => Dólar Americano (CLP -> USD)
                    7) Salir
                    
                    *************************************************
                    """);
            // -- seleccionar conversion
            Scanner teclado = new Scanner(System.in);
            var input = teclado.nextInt();
            ExchangeAPI convertir

        }


        // -- generar solicitud - recibir respuesta
        // mostrar respuesta - mostrar menu
    }
}
