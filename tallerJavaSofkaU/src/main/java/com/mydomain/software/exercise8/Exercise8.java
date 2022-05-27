package com.mydomain.software.exercise8;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * [Crea una aplicación por consola que nos pida un día de la semana
 * y que nos diga si es un día laboral o no. Usa un switch para ello.]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise8 {

    /**
     * Atributo para almacenar el mensaje
     */
    private String text;

    public String captureDay() {
        Logger logger = Logger.getLogger(Exercise8.class.getName());
        Scanner capture = new Scanner(System.in);
        logger.info("Digite el dia de la semana es español: ");
        return capture.nextLine().toLowerCase();
    }

    /**
     * Metodo para saber si el dia es laboral o no
     *
     * @param value valor enviado del dia de la semana
     */
    public void businessDayNot(String value) {
        switch (value) {
            case "lunes": {
                setText("El dia lunes es laboral");
                break;
            }
            case "martes": {
                setText("El dia martes es laboral");
                break;
            }
            case "miercoles": {
                setText("El dia miercoles es laboral");
                break;
            }
            case "jueves": {
                setText("El dia jueves es laboral");
                break;
            }
            case "viernes": {
                setText("El dia viernes es laboral");
                break;
            }
            case "sabado": {
                setText("El dia sabado no es laboral");
                break;
            }
            case "domingo": {
                setText("El dia domingo no es laboral");
                break;
            }
            default: {
                setText("Valor ingresado no valido");
            }
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
