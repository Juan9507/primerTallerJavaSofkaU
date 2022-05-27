package com.mydomain.software.exercise1;

/**
 * Interfaz para reutilizar en los ejercicio1 y ejercicio2
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public interface BiggerSame {
    /**
     * Metodo para hallar el numero mayor y/o menor
     *
     * @param value1 parametros para el primer numero
     * @param value2 parametros para el segundo numero
     */
    void valueBiggerSame(int value1, int value2);

    /**
     * Metodo para hallar si los numero son iguales
     *
     * @param value1 parametros para el primer numero
     * @param value2 parametros para el segundo numero
     */
    void valueSame(int value1, int value2);
}
