package com.mydomain.software.exercise7;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * [Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
 * si no lo es lo volverá a pedir (do while), después muestra ese número por consola..]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise7 {

    /**
     * Atrubuto para el valor del numero
     */
    private int value;

    /**
     * Metodo para comparar el numero enviado
     *
     */
    public void checkNumber() {
        Logger logger = Logger.getLogger(Exercise7.class.getName());
        Scanner capture = new Scanner(System.in);
        do {
            logger.info("Digite el numero a comparar: ");
            setValue(Integer.parseInt(capture.nextLine()));
        } while (getValue() < 0);
        logger.info(() -> String.valueOf(getValue()));
    }

    /**
     * getter para mostrar el valor
     * @return retorna el valor
     */
    public int getValue() {
        return value;
    }

    /**
     * Setter para modificar el valor
     * @param value se le envia el valor a modificar
     */
    public void setValue(int value) {
        this.value = value;
    }
}
