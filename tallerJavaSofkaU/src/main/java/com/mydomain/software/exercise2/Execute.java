package com.mydomain.software.exercise2;

import java.util.logging.Logger;

/**
 * class para compilar el ejercicio 2
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Execute {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Execute.class.getName());
        String result;
        Exercise2 exercise2 = new Exercise2();
        exercise2.numberEvaluate();
        result = exercise2.toString();
        logger.info(result);
    }
}
