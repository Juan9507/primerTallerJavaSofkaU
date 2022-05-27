package com.mydomain.software.exercise4;

import java.util.logging.Logger;

/**
 * [Clase main para ejecutar el ejercicio 4]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Execute {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Execute.class.getName());
        Exercise4 exercise4 = new Exercise4();
        exercise4.askValue();
        double valueTotal = exercise4.getValueFinal();
        logger.info(() -> "El valor total con aumento en el iva es de: " + valueTotal);
    }
}
