package services;


import lombok.Data;
import lombok.extern.java.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

@Data
public class FileReader {

    private int dataFromFile;

    public FileReader() {

        Utilities utilities = new Utilities();
        Logger logger = Logger.getLogger(FileReader.class.getName());

        try {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("number.txt");

            setDataFromFile(Integer.parseInt(utilities.readFromInputStream(is)));
            logger.info("Loaded file number.txt wirh value " + getDataFromFile());
        } catch (IOException e) {
            e.printStackTrace();
            logger.warning("Problem with file: "+ e.getMessage());
        }

    }


}
