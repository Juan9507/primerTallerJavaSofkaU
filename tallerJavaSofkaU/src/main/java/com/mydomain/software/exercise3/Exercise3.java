package com.mydomain.software.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/**
 * [Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
 * (recuerda pasar de String a double con Double.parseDouble).
 * Usa la constante PI y el método pow de Math.]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise3 {
    Logger logger = Logger.getLogger(Exercise3.class.getName());

    /**
     * Metodo para escribir por consola el radio
     */
    public void askRadio() {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            logger.info("Digite el area del circulo");
            double radio = Double.parseDouble(buffer.readLine());
            area(radio);
        } catch (IOException e) {
            logger.warning("Error al capturar el valor");
        }

    }

    /**
     * Metodo para hallar el area
     *
     * @param radio parametro que recibe el radio
     */
    public void area(double radio) {
        final double pi = 3.14;
        double area;
        area = (pi * Math.pow(radio, 2));
        logger.info(() -> "El area del circulo es : " + area);
    }
}
