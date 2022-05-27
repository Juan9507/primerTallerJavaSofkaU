package com.mydomain.software.exercise4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/**
 * [Lee un número por teclado que pida el precio de un producto (puede tener decimales)
 * calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 * ]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise4 {
    /**
     * Atributo para almacenar el valor final
     */
    private double valueFinal;

    /**
     * Metodo pedir el valor del producto
     */
    public void askValue() {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        Logger logger = Logger.getLogger(Exercise4.class.getName());
        try {
            logger.info("Digite el valor del producto: ");
            float productValue = Float.parseFloat(buffer.readLine());
            calculateIva(productValue);
        } catch (Exception ex) {
            logger.warning("Captura del valor del producto salio mal");
        }
    }

    /**
     * Metodo para calcular el iva
     *
     * @param value valor del producto
     */
    public void calculateIva(float value) {
        final float iva = 0.21f;
        double amountTotal = value * iva;
        valueTotal(amountTotal, value);
    }

    /**
     * Metodo para pasarle el valor final al atributo valueFinal
     *
     * @param amountTotal precio con iva
     * @param value       precio del producto
     */
    public void valueTotal(double amountTotal, float value) {
        setValueFinal(amountTotal + value);
    }

    /**
     * Getter para mostrar el valorFinal
     *
     * @return el valor final
     */
    public double getValueFinal() {
        return valueFinal;
    }

    /**
     * Setter para modificar el valorFinal
     *
     * @param valueFinal recibe el valor a modificar
     */
    public void setValueFinal(double valueFinal) {
        this.valueFinal = valueFinal;
    }
}
