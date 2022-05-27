package com.mydomain.software.exercise2;

import com.mydomain.software.exercise1.Exercise1;
import com.mydomain.software.exercise1.BiggerSame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.logging.Logger;

/**
 * [ Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores,
 * menores o iguales.
 * ]
 * <p>
 * Como funciona:
 * Ejercicio2 ejercicio2 = new Ejercicio2();
 * ejercicio2.numerosEvaluar();
 * String resultado = ejercicio2.toString();
 * logger.info(resultado);
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise2 implements BiggerSame {
    /**
     * Atributo privada para almacenar el resultado
     */
    private String result;

    /**
     * Metodo para digitar los numeros a comparar
     */
    public void numberEvaluate() {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        Logger logger = Logger.getLogger(Exercise1.class.getName());

        try {
            logger.info("Digite el primer numero: ");
            int valor1 = Integer.parseInt(buffer.readLine());
            logger.info("Digite el segundo numero: ");
            int valor2 = Integer.parseInt(buffer.readLine());
            valueBiggerSame(valor1, valor2);
            valueSame(valor1, valor2);
        } catch (IOException ex) {
            logger.warning("Error al capturar el valor");
        }

    }

    /**
     * Metodo para el numero mayor y menor
     *
     * @param value1 parametro primer numero
     * @param value2 parametro segundo numero
     */
    @Override
    public void valueBiggerSame(int value1, int value2) {
        if (value1 > value2) {
            this.result = value1 + " es el mayor y el " + value2 + " es el menor";
        } else {
            this.result = value2 + " es el mayor y el " + value1 + " es el menor";
        }
    }

    /**
     * Metodo para numeros iguales
     *
     * @param value1 parametro primer numero
     * @param value2 parametro segundo numero
     */
    @Override
    public void valueSame(int value1, int value2) {
        if (value1 == value2) {
            this.result = value1 + " y " + value2 + " son iguales";
        }
    }

    /**
     * Metodo sobrecargado para toString
     *
     * @return retorna el resultado
     */
    @Override
    public String toString() {
        return result;
    }
}
