package com.mydomain.software.exercise9;

/**
 * [Del texto, “La sonrisa sera la mejor arma contra la tristeza”
 * Reemplaza todas las a del String anterior por una e,
 * adicionalmente concatenar a esta frase una adicional que
 * ustedes quieran incluir por consola y las muestre luego unidas..]
 *
 * @author [Juan David Rivera Naranjo - juandavidnaranjo75@gmail.com]
 * @version [v1.0.0]
 * @since [v1.0.0]
 */
public class Exercise9 {

    /**
     * Atributo para la frase
     */
    private String sentence;

    /**
     * Metodo constructor de la clase
     */
    Exercise9(){
        this.sentence = "La sonrisa sera la mejor arma contra la tristeza";
    }

    /**
     * Metodo para remplazar el texto y concatenarle otra
     */
    public void replaceConcatText(){
        setSentence(this.sentence.replace("a","e"));
        setSentence(this.sentence.concat(" siempre intenta ser feliz"));
    }

    /**
     * Metodo getter del atributo frase
     * @return retorna la frace
     */
    public String getSentence() {
        return sentence;
    }

    /**
     * Metodo setter para modificar el atributo
     * @param sentence Se el pasa el texto a modificar
     */
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
