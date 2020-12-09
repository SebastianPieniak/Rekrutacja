package services;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

@Data
public class Calculator {

    private ArrayList numbers = new ArrayList();
    Logger logger = Logger.getLogger(Calculator.class.getName());


    public Calculator() {
    }

    public void calc(String operation, Object... inputData) {

        if(inputData == null) {
            logger.info("Empty inputData");
            return;
        }

        if (onlyInts(inputData)) {

            for (int i = 0; i < inputData.length; i++) {
                this.numbers.add(inputData[i]);
            }
            logger.info("loaded numbers: " + getNumbers());

            switch (operation) {
                case "DODAWANIE":
                    System.out.println("SUM of " + getNumbers() + " is " + calcSum(getNumbers()));
                    break;
                default:
                    logger.warning("Not supported operation");
            }
        } else {
            logger.warning("Not supported input data type - only int");
        }
    }

    public int calcSum(ArrayList numbers) {
        return Arrays.stream(numbers.toArray()).mapToInt(x -> (int) x)
                .sum();
    }

    protected boolean onlyInts(Object... inputData) {
        boolean onlyNumbers = true;
        for (int i = 0; i < inputData.length; i++) {
            if (inputData[i] == null) {
                return false;
            } else if (!"java.lang.Integer".equals(inputData[i].getClass().getTypeName())) {
                return false;
            }

        }
        logger.info("onlyInts in inputData  - " + onlyNumbers);
        return onlyNumbers;
    }

}
