package com.mydomain.software.exercise1;

import java.util.logging.Logger;

/**
 * class para compilar el ejercicio 1
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Execute {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Execute.class.getName());
        String result;
        Exercise1 exercise1 = new Exercise1();
        exercise1.numberEvaluate();
        result = exercise1.toString();
        logger.info(result);
    }
}
