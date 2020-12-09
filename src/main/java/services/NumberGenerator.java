package services;

import java.util.logging.Logger;

public class NumberGenerator {

    Logger logger = Logger.getLogger(NumberGenerator.class.getName());


    public NumberGenerator() {
    }

    public int generateNumber() {

        int randomNumber = (int) (Math.random() * 999) + 1;
        logger.info("Generated number: "+randomNumber);
        return randomNumber;

    }

}
