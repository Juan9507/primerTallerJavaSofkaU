package com.mydomain.software.exercise8;

import java.util.logging.Logger;

public class Execute {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Execute.class.getName());
        Exercise8 exercise8 = new Exercise8();
        String text = exercise8.captureDay();
        exercise8.businessDayNot(text);
        logger.info(exercise8.getText());
    }
}
