package com.mydomain.software.exercise1;

/**
 * [ Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 * Si son iguales indicarlo también.
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise1 implements BiggerSame {
    /**
     * Variable privada para almacenar el resultado
     */
    private String result;

    /**
     * Metodo para enviar los numero a evaluar
     */
    public void numberEvaluate() {
        valueBiggerSame(8, 8);
        valueSame(8, 8);
    }

    /**
     * Metodo para hallar el numero mayor sin el menor
     *
     * @param value1 primer numero
     * @param value2 segundo numero
     */
    @Override
    public void valueBiggerSame(int value1, int value2) {
        if (value1 > value2) {
            this.result = "El numero " + value1 + " es el mayor";
        } else {
            this.result = "El numero " + value2 + " es el mayor";
        }
    }

    /**
     * Metodo para saber si los numeros son iguales
     *
     * @param value1 primer numero
     * @param value2 segundo numero
     */
    @Override
    public void valueSame(int value1, int value2) {
        if (value1 == value2) {
            this.result = "Los dos numeros son iguales";
        }
    }

    /**
     * metodo toString
     *
     * @return retorna el resultado
     */
    @Override
    public String toString() {
        return result;
    }
}
