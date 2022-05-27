package com.mydomain.software.exercise6;

import com.mydomain.software.exercise5.Exercise5;

import java.util.logging.Logger;

/**
 * [Muestra los números impares y pares del 1 al 100
 * (ambos incluidos). Usa un bucle for.]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise6 {

    /**
     * Metodo para saber si son los numeros pares e impares
     * y se le envia al metodo showValue
     */
    public void pairOdd() {
        for (int i = 1; i <= 100; i++) {
            if (Math.floorMod(i, 2) == 0) {
                showValue(i, " el numero es par ");
            } else {
                showValue(i, " el numero es impar ");
            }
        }
    }

    /**
     * Metodo para imprimir el numero y el texto
     *
     * @param i   valor con el numero a evaluar
     * @param txt texto para decir si es par o impar
     */
    public void showValue(int i, String txt) {
        Logger logger = Logger.getLogger(Exercise5.class.getName());
        logger.info(() -> i + txt);
    }
}
