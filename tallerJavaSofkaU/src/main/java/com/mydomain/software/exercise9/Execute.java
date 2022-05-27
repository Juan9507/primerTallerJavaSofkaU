package com.mydomain.software.exercise9;

import java.util.logging.Logger;

public class Execute {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Execute.class.getName());
        Exercise9 exercise9 = new Exercise9();
        exercise9.replaceConcatText();
        logger.info(exercise9.getSentence());
    }
}
